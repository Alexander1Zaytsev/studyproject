package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.core.ConnectionManager;
import com.brainacad.studyproject.data.dao.AdDao;
import com.brainacad.studyproject.data.domain.Ad;
import com.brainacad.studyproject.data.domain.AdType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import static com.brainacad.studyproject.data.domain.AdType.*;

/**
 * Created by Alexander on 11/22/2016.
 */
public class JdbcAdDao implements AdDao {

    public static final String SELECT_FROM_ADS_BY_ID = "select a.*, uar.user_id from ads a left join user_ad_ref uar on a.ad_id = uar.ad_id having a.ad_id = ?";

    private ConnectionManager connectionManager = ConnectionManager.getInstance();

    @Override
    public Ad getAddByShort(String shortDescript) {
        return null;
    }

    @Override
    public Ad get(int id) {
        Connection connection = connectionManager.getConnection();
        Ad ad = null;

        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_FROM_ADS_BY_ID);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet != null) {
                ad = new Ad();
                while (resultSet.next()){
                    ad.setId(resultSet.getInt("ad_id"));
                    ad.setShortDescription(resultSet.getString("short_description"));
                    ad.setFullDescription(resultSet.getString("full_description"));
                    AdType adType;
                    switch (resultSet.getInt("ad_type")){
                        case 1:
                            adType = SELL;
                            break;
                        case 2:
                            adType = PURCHASE;
                            break;
                        case 3:
                            adType = EXCHANGE;
                            break;
                        default:
                            adType = ABSENT_AD_TYPE;
                            break;
                    }
                    ad.setAdType(adType);
                    ad.setUserIdAdGot(resultSet.getInt("user_id"));
                }
            }
            connectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ad;
    }

    @Override
    public int add(Ad entity) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Ad entity) {
        return false;
    }

    @Override
    public Collection<Ad> getAll() {
        return null;
    }
}
