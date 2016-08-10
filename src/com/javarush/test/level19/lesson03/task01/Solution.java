package com.javarush.test.level19.lesson03.task01;

/* TableAdapter
Измените класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".
Пример, "[Amigo] : DashboardTable"
*/

<<<<<<< HEAD
public class Solution
{
    public static void main(String[] args)
    {
        //это пример вывода
        ATable aTable = new ATable()
        {
            @Override
            public String getCurrentUserName()
            {
=======
public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
>>>>>>> origin/master
                return "Amigo";
            }

            @Override
<<<<<<< HEAD
            public String getTableName()
            {
=======
            public String getTableName() {
>>>>>>> origin/master
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

<<<<<<< HEAD
    public static class TableAdapter implements BTable
    {

        String username;
        String tablename;

        public TableAdapter(ATable aTable)
        {
            username = aTable.getCurrentUserName();
            tablename = aTable.getTableName();
=======
    public static class TableAdapter implements  BTable{


        public TableAdapter(ATable aTable)
        {

>>>>>>> origin/master
        }

        @Override
        public String getHeaderText()
        {
<<<<<<< HEAD
            return "[" + username + "] : " + tablename;
        }
    }

    public interface ATable
    {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable
    {
=======
            return null;
        }
    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
>>>>>>> origin/master
        String getHeaderText();
    }
}