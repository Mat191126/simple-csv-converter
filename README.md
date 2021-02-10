# simple-csv-converter
A simple program that converts given csv file into a different file type.

1. Download repository to your computer (you need to have installed Maven and at least java 14).
2. Run 'mvn install' command in project folder to create jar file.
3. Next enter 'java -jar target/simple-csv-converter-jar-with-dependencies.jar <file type> <path to csv file>' command.
    You can convert csv file to:
    - table
    - xml file
    - json file
    
  Example command is 'java -jar target/simple-csv-converter-jar-with-dependencies.jar xml src/main/resources/testFile.csv'.
  If you don't enter any file type, the default is table.
