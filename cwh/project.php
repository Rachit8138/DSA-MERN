<?php
$insert = false;

if(isset($_POST['name'])){

    $server = "localhost";
    $username = "root";
    $password = "";
    $database = "trip";

    // Create connection
    $con = mysqli_connect($server, $username, $password, $database);

    // Check connection
    if(!$con){
        die("Connection failed: " . mysqli_connect_error());
    }

    // Collect POST data
    $name = $_POST['name'];
    $gender = $_POST['gender'];
    $age = $_POST['age'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $desc = $_POST['desc'];

    // SQL query
    $sql = "INSERT INTO `trip`
    (`name`, `age`, `gender`, `email`, `phone`, `other`, `dt`)
    VALUES
    ('$name', '$age', '$gender', '$email', '$phone', '$desc', current_timestamp())";

    // Execute query
    if($con->query($sql) == true){
        $insert = true;
    }
    else{
        echo "ERROR: $sql <br> $con->error";
    }

    $con->close();
}
?>