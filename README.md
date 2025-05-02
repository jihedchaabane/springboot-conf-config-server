# springboot-conf-config-server
-----------------------------------------------------
IN "10.0.0.137" do:
-----------------------------------------------------
sudo firewall-cmd --add-port=8762/tcp --permanent
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all

---Fermer le port 8762 -------------------------------
sudo firewall-cmd --permanent --remove-port=8762/tcp
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all
-----------------------------------------------------

https://master-spring-ter.medium.com/deep-dive-into-spring-boot-config-server-composite-d5f6c51d6317