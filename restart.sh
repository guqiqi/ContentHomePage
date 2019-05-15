sudo cp -r frontend /var/www/html/herencup
sudo cp -r admin-frontend /var/www/html/admin
cd herencup
mvn clean package
sudo nohup java -jar target/herencup-1.0-SNAPSHOT.jar &
cd ..
/etc/init.d/nginx start
