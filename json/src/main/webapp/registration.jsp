<%@ page import="java.io.*"%>
<%@page import="java.net.*"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<html>
<head>
    <title>User Information</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>User Information</h2>
    <table>
        <tr>
            <th>Page</th>
            <th>Total Pages</th>
            <th>First Name</th>
            <th>Avatar</th>
        </tr>

<%
String apiUrl = "https://reqres.in/api/users?page=2";
try {
    // Connect to the URL and get the JSON response
    URL url = new URL(apiUrl);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    int responseCode = connection.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response1 = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Parse the JSON response
        JSONObject jsonResponse = new JSONObject(response.toString());
        int page1 = jsonResponse.getInt("page");
        int totalPages = jsonResponse.getInt("total_pages");
        JSONArray users = jsonResponse.getJSONArray("data");

        // Display user information in HTML table
        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            String firstName = user.getString("first_name");
            String avatar = user.getString("avatar");

            out.println("<tr>");
            out.println("<td>" + page + "</td>");
            out.println("<td>" + totalPages + "</td>");
            out.println("<td>" + firstName + "</td>");
            out.println("<td><img src='" + avatar + "' alt='Avatar'></td>");
            out.println("</tr>");
        }
    } else {
        out.println("Failed to retrieve" 
        		+"data from the API. Response code: " + responseCode);
    }
    connection.disconnect();
} catch (Exception e) {
    out.println("An error occurred: " + e.getMessage());
}
%>

    </table>
</body>
</html>
