<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ff7f7f;
            background-image: url("images/bg2.jpeg") ;
            background-size: cover;
            background-repeat: no-repeat ;
        }
        .registration-form {
            max-width: 400px;
            margin: 0 auto;
            padding: 35px;
            background-color: #d9d9d9;
            background-color: #ff7f7f;
            background-image: url("images/bg2.jpeg") ;
            background-size: cover;
            border-radius: 6px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .registration-form h1 {
            color: whitesmoke;
            text-align: center;
            margin-bottom: 20px;
        }
        .registration-form label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: whitesmoke;
        }
        .registration-form input[type="text"],
        .registration-form input[type="email"],
        .registration-form input[type="password"],
        .registration-form select {
            width: 100%;
            padding: 10px;
            
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .registration-form input[type="submit"] {
            width: 100%;
            background-color: red;
            color: #ffffff;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
        .registration-form input[type="submit"]:hover {
            background-color: black;
        }
    </style>
</head>
<body>
    
    
   <%
       
       String username= (String)session.getAttribute("username");
       System.out.println(username);
       String fname=      (String)session.getAttribute("fname");
       String lname=      (String)session.getAttribute("lname");
       String email=      (String)session.getAttribute("email");
       String number=     (String)session.getAttribute("number");
       String address=    (String)session.getAttribute("address");
       String hostelname= (String)session.getAttribute("hostelname");
       String htype=      (String)session.getAttribute("htype");
       String rent=       (String)session.getAttribute("rent");
       String rooms=      (String)session.getAttribute("rooms");
       String time=       (String)session.getAttribute("time");
       String mess=       (String)session.getAttribute("mess");
       String password=   (String)session.getAttribute("password");
       String pcode=      (String)session.getAttribute("pcode");
       if(username==null)
        {
        response.sendRedirect("login.html");
        }
       request.setAttribute("username", username);
   %>
    <div class="registration-form">
        <h1><%=username%></h1>
        <form action="UpdateData" method="post">
            <input type="hidden" value="<%=username%>" name="username">
             <label for="firstName">First Name:</label>
            <input type="password" id="password" name="password" placeholder="PAssword" value = "<%=password%>" required>
            
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="fname" placeholder="First Name" value = "<%=fname%>" required>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lname" placeholder="Last Name" value = "<%=lname%>" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="email" value = "<%=email%>" required>

            <label for="number"> Mobile No.:</label>
            <input type="text" id="number" name="number" placeholder="Mobile Number" value = "<%=number%>" required>

             <label for="hostelname">Name of Hostel:</label>
            <input type="text" id="hostelname" name="hostelname" placeholder="Hostel Name" value = "<%=hostelname%>">
            
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" placeholder="Address" value = "<%=address%>">

            <label for="rent">Pin code:</label>
            <input type="text" id="pcode" name="pcode" placeholder="Pin Code" value = "<%=pcode%>">
            
            <label for="rooms">No. of Rooms</label>
            <input type="text" id="rooms" name="rooms" placeholder="Rooms" value = "<%=rooms%>" required >
            
             <label for="time">Time:</label>
            <input type="text" id="time" name="time" placeholder="Time limit" value = "<%=time%>">
            
            <label for="rent">Rent:</label>
            <input type="text" id="rent" name="rent" placeholder="Rent per month" value = "<%=rent%>">
            
            
             <label for="mess">Mess:</label>
            <select id="mess" name="mess" value = "<%=mess%>">
                <option value="y">Yes</option>
                <option value="n">No</option>
            </select>
             
            <label for="htype">Hostel Type:</label>
            <select id="htype" name="htype" value = "<%=htype%>">
                <option value="boy">Boys</option>
                <option value="girl">Girls</option>
                <option value="coed">Coed</option>
            </select>

            <input type="submit" value="Update">
        </form>
    </div>
</body>
</html>
