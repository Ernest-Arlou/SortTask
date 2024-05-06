# SortTask


Задание
Создайте java-приложение, которое будет считывать данные из источника (файл in.txt) и выполнять их сортировку. Данные имеют табличную структуру. Строки разделены переносом строки. Столбцы – знаком табуляции.

Данные необходимо отсортировать и вывести в файл out.txt.

Сортировка производится сначала по первой колонке строк, потом по второй (если строки или числа в первой колонке совпадают) и т. д. Данные, относящиеся к одной строке в гриде, должны быть также в одной строке.

При этом: любое число в колонке выше любого не числа, числа отсортированы по возрастанию, строки в лексикографическом порядке.


Результат: 
maven-проект консольного приложения, который позволяет получить runnable .jar файл.
Должна быть использована 11-я версия Java.

Как будет происходить проверка вашей программы?
1.	Сборка при помощи команды mvn package
2.	В папку с SortTask-1.0-SNAPSHOT.jar будет скопирован in.txt 
3.	Полученный jar файл будет запущен при помощи команды java -jar SortTask-1.0-SNAPSHOT.jar
4.	Проверка содержимого out.txt.
--------------------------------------------------------------------------

Task 
Create a java application that will read data from a source (in.txt file) and sort it. The data has a tabular structure. Lines are separated by line breaks. Columns are marked with tabs.

The data must be sorted and output to the out.txt file.

Sorting is done first by the first column of rows, then by the second (if the rows or numbers in the first column match), etc. Data related to one row in the grid must also be in one row.

In this case: any number in the column is higher than any non-number, numbers are sorted in ascending order, rows are in lexicographical order.

Result: a maven project of a console application that allows you to get a runnable .jar file. Java version 11 must be used.

How will your program be verified?

1.	Build using mvn package command
2.	Сin.txt will be copied to the folder with SortTask-1.0-SNAPSHOT.jar
3.	СThe resulting jar file will be launched using the command java -jar SortTask-1.0-SNAPSHOT.jar
4.	СChecking the contents of out.txt.

