package SQLZapros;

import java.util.Map;

public class SQLQueryBuilder {
        public static void main(String[] args) {

            String[] params = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", "true"};

            // Формируем SQL запрос с помощью StringBuilder
            String sqlQuery = buildSqlQuery(params);
            System.out.println(sqlQuery);
        }

        public static String buildSqlQuery(String[] params) {
            StringBuilder sqlQueryBuilder = new StringBuilder();
            sqlQueryBuilder.append("SELECT * FROM cars WHERE ");

            // Используем цикл для обхода параметров с шагом 2, так как массив params должен содержать пары "ключ-значение"
            for (int i = 0; i < params.length; i += 2) {
                String key = params[i];
                String value = params[i + 1];

                if (value != null) {
                    // Если значение параметра не равно null, добавляем его в запрос
                    sqlQueryBuilder.append(key).append(" = '").append(value).append("'");

                    // Добавляем "AND" после каждого параметра, кроме последнего
                    if (i < params.length - 2) {
                        sqlQueryBuilder.append(" AND ");
                    }
                }
            }

            return sqlQueryBuilder.toString();
        }
    }