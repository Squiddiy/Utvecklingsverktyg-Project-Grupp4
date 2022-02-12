# Utvecklingsverktyg-Project-Grupp4
 
How to build

First way
1. Open Project With Eclipse
2. Right click pom.xml and choose : Run as -> Maven Install
3. Then ur project will get build with a jar file and a javadoc in the target folder of the copied project

Second way
1. Setup Jenkins so it works for your computer
2. Click "Add new Item" and choose "Freestyle Proejct" give resonable name and click ok
3. Choose "Git" Under "Source cood management" and add this repo
4. Choose ur maven version under "build"
6. add build step "Invoke top level maven-targets" and click Save
7. and type "install" in the box and then click build
8. Then click "Build Now"
9. Then u should have the project compiled on ur computer
