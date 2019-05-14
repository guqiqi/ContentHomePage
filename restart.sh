cd frontend
sudo cp -r dist /var/www/html/herencup
cd ..
cd admin-frontend
sudo cp -r dist /var/www/html/admin
/etc/init.d/nginx start