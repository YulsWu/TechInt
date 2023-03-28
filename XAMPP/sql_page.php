<!-- PHP part -->
<?php

$user = 'root';
$password = '';
$database = 'test';
$servername = 'localhost:3306';
$mysqli = new mysqli ($servername, $user, $password, $database);

if ($mysqli->connect_error){
    die("Connection failed: " . $mysqli->connect_error);
}

$adminQuery = "SELECT first_name, last_name, role FROM employees WHERE role='A'";
$modQuery = "SELECT first_name, last_name, role FROM employees WHERE role='M'";

$admins = $mysqli->query($adminQuery);
$mods = $mysqli->query($modQuery);

$mysqli->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>"Hello, World!"</title>
    <meta name="author" content="YW"/>
    <meta charset='utf-8'/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href=""/>
    <script src="javascript.js"></script>
    <script src=""></script>
</head>
<body>
    <table>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Role</th>
        </tr>
        <?php
            while($rows=$admins->fetch_assoc()){
        ?>
        <tr>
            <td><?php echo $rows['first_name'];?></td>
            <td><?php echo $rows['last_name'];?></td>
            <td><?php echo $rows['role'];?></td>
        </tr>
        <?php
            }
        ?>
        <?php
            while($rows=$mods->fetch_assoc()){
        ?>
        <tr>
            <td><?php echo $rows['first_name'];?></td>
            <td><?php echo $rows['last_name'];?></td>
            <td><?php echo $rows['role'];?></td>
        </tr>
        <?php
            }
        ?>    
    </table>
<form action="Hello_page.html">
    <input type="submit" value="Go to List" />
</form>


</body>
</html>