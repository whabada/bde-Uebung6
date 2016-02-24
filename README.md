# bde-Uebung6
Dieses Repo enthält die Dateien zur Übung 6 für BDE an der FH Münster.

Eigentlich sollte dieses Projekt den erfolgreichen Ablauf eines Oozie Workflows zeigen. Die Idee war, den MapReduce Job je nach Ausgang mit einem Java Dialog zu versehen, der durch Oozie ausgewählt wird. Dies sollte auch zeitlich angestoßen jede Stunde geschehen. 

Leider kommen nun zwei Probleme zusammen: Fehlende Kompetenz und Zeitmangel. 

Beim Versuch, Oozie zu starten, erhalte ich permanent folgenden Fehlercode:
```
[cloudera@quickstart ~]$ oozie job -run -oozie http://quickstart.cloudera:11000/oozieUeb6/ -config oozieUeb6/job.properties 
Error: HTTP error code: 404 : Not Found
```

Leider hilft mir auch das Netz adhoc nicht weiter. Meine Vermutung liegt darin, dass wir im Rahmen unseres BDE Projekts mit dem Webserver rumgespielt haben. Doch leider kann ich dies nicht belegen. 
Dennoch wollte ich Ihnen den Versuch, bzw. die Ansätze nicht vorenthalten. 
