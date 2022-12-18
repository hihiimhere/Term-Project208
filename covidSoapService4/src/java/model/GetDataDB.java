/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import static java.lang.Math.log;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author athap
 */
public class GetDataDB {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("covidSoapService4PU");

    public static void main(String[] args) {
        try {
            URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/today-cases-all");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                System.out.println(informationString);

                parse(String.valueOf(informationString));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String parse(String responseBody) {
        JSONArray dataObj = new JSONArray(responseBody);
        for (int i = 0; i < dataObj.length(); i++) {
            JSONObject data = dataObj.getJSONObject(i);
            int years = data.getInt("year");
            int weeknum = data.getInt("weeknum");
            int new_case = data.getInt("new_case");
            int total_case = data.getInt("total_case");
            int new_case_excludeabroad = data.getInt("new_case_excludeabroad");
            int total_case_excludeabroad = data.getInt("total_case_excludeabroad");
            int new_recovered = data.getInt("new_recovered");
            int total_recovered = data.getInt("total_recovered");
            int new_death = data.getInt("new_death");
            int total_death = data.getInt("total_death");
            int case_foreign = data.getInt("case_foreign");
            int case_prison = data.getInt("case_prison");
            int case_walkin = data.getInt("case_walkin");
            int case_new_prev = data.getInt("case_new_prev");
            int case_new_diff = data.getInt("case_new_diff");
            int death_new_prev = data.getInt("death_new_prev");
            int death_new_diff = data.getInt("death_new_diff");
            String update_date = data.getString("update_date");
            
            insertData(years, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad,
                    new_recovered, total_recovered, new_death, total_death, case_foreign, case_prison,
                    case_walkin, case_new_prev, case_new_diff, death_new_prev, death_new_diff,
                    update_date);
        }
        return null;
    }

    public static void insertData(int years, int weeknum, int new_case, int total_case, int new_case_excludeabroad, int total_case_excludeabroad,
            int new_recovered, int total_recovered, int new_death, int total_death, int case_foreign, int case_prison,
            int case_walkin, int case_new_prev, int case_new_diff, int death_new_prev, int death_new_diff,
            String update_date) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("covidSoapService4PU");
        EntityManager em = emf.createEntityManager();
        
        Coviddata cv = new Coviddata();
        cv.setYears(years);
        cv.setWeeknum(weeknum);
        cv.setNewCase(new_case);
        cv.setTotalCase(total_case);
        cv.setNewCaseExcludeabroad(new_case_excludeabroad);
        cv.setTotalCaseExcludeabroad(total_case_excludeabroad);
        cv.setNewRecovered(new_recovered);
        cv.setTotalRecovered(total_recovered);
        cv.setNewDeath(new_death);
        cv.setTotalDeath(total_death);
        cv.setCaseForeign(case_foreign);
        cv.setCasePrison(case_prison);
        cv.setCaseWalkin(case_walkin);
        cv.setCaseNewPrev(case_new_prev);
        cv.setCaseNewDiff(case_new_diff);
        cv.setCaseNewPrev(case_new_prev);
        cv.setDeathNewPrev(death_new_prev);
        cv.setDeathNewDiff(death_new_diff);
        cv.setUpdateDate(update_date);

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("covidSoapService4PU");
//        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try {
            em.persist(cv);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
