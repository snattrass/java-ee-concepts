# (4) JMS Notes

A brief (one day) course on some basics of Java EE.

## 1. Demo JBoss standalone-full.xml
This module required **Messaging** functionality which is not present in `standalone.xml`.  The easiest solution is to use
`standalone-full.xml`

> `./standalone.sh -c standalone-full.xml`

## 2. JMS administered objects - create the queue
Add the queue as an administation object, either via the CLI of the web based admin console.
```
$ ./jboss-cli.sh

Unable to read the logging configuration from 'file:/c/dev/bin/jboss/wildfly-10.0.0-vanilla/bin/jboss-cli-logging.properties' (java.io.FileNotFoundException: \c\dev\bin\jboss\wildfly-10.0.0-vanilla\bin\jboss-cli-logging.properties (The system cannot find the path specified))
INFO  [org.jboss.modules] JBoss Modules version 1.5.1.Final
INFO  [org.jboss.as.cli.CommandContext] You are disconnected at the moment. Type 'connect' to connect to the server or 'help' for the list of supported commands.
You are disconnected at the moment. Type 'connect' to connect to the server or 'help' for the list of supported commands.
[disconnected /] connect localhost:9990
INFO  [org.xnio] XNIO version 3.3.4.Final
INFO  [org.xnio.nio] XNIO NIO Implementation Version 3.3.4.Final
INFO  [org.jboss.remoting] JBoss Remoting version 4.0.18.Final
[standalone@localhost:9990 /] jms-queue add --queue-address=BookOrderQueue --entries=java:/jms/javaee-concepts/queue/BookOrderQueue,java:/jboss/exported/jms/javaee-concepts/queue/BookOrderQueue
[standalone@localhost:9990 /] exit
```

Show the queue in the JBoss UI.

> `http://localhost:9990/console/App.html`

Configuration > Subsystems > Messaging ActiveMQ > Queues/Topics

## 3. JMS administered objects - create the user for remote connection via JNDI and binding lookup
```
$ ./add-user.sh

What type of user do you wish to add?
 a) Management User (mgmt-users.properties)
 b) Application User (application-users.properties)
(a): b
Enter the details of the new user to add.
Using realm 'ApplicationRealm' as discovered from the existing property files.
User 'jms-user' already exists and is enabled, would you like to...
 a) Update the existing user password and roles
 b) Disable the existing user
 c) Type a new username
Password recommendations are listed below. To modify these restrictions edit the add-user.properties configuration file.
 - The password should be different from the username
 - The password should not be one of the following restricted values {root, admin, administrator}
 - The password should contain at least 8 characters, 1 alphabetic character(s), 1 digit(s), 1 non-alphanumeric symbol(s)
Password :
WFLYDM0099: Password should have at least 8 characters!
Re-enter Password : t to use the password entered yes/no? yes
Updated user 'jms-user' to file 'C:\dev\bin\jboss\wildfly-10.0.0-vanilla\standalone\configuration\application-users.properties'
Updated user 'jms-user' to file 'C:\dev\bin\jboss\wildfly-10.0.0-vanilla\domain\configuration\application-users.properties'
Updated user 'jms-user' with groups guest to file 'C:\dev\bin\jboss\wildfly-10.0.0-vanilla\standalone\configuration\application-roles.properties'
Updated user 'jms-user' with groups guest to file 'C:\dev\bin\jboss\wildfly-10.0.0-vanilla\domain\configuration\application-roles.properties'
Is this new user going to be used for one AS process to connect to another AS process?
e.g. for a slave host controller connecting to the master or for a Remoting connection for server to server EJB calls.
yes/no? no
```

## (4) Walkthought MDB
- @MessageDriven
- MessageListener
- Asynchronous nature

## (5) Walkthrough BookOrderProducer 
- ConnectionFactory and the JNDI binding (in-VM see `standalone-full.xml`)
- Queue and the JNDI binding
- JMSConect
- JMSProducer
- Send

In Postman
- Create order
