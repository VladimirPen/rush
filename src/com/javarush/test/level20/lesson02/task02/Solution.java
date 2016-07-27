package com.javarush.test.level20.lesson02.task02;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution
{
    public static void main(String[] args)
    {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try
        {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            /*User user = new User();
            //user.setCountry(User.Country.valueOf("UKRAINE"));
            //user.setBirthDate(new Date());
            user.setFirstName("Vlad\nimir");
            //user.setLastName("Penkov");
            //user.setMale(true);
            javaRush.users.add(user);
            javaRush.users.add(user);*/

            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            loadedObject.save(outputStream);
            outputStream.close();
            inputStream.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush
    {
        public List<User> users = new ArrayList<>();

        private static String seprartor = "###";
        private static String seprartorRow = "%%%";
        private static String seprartorValue = "$$$";

        public void save(OutputStream outputStream) throws Exception
        {
            String result = "";
            for (User user : users)
            {
                result += "firstName" + seprartorValue + user.getFirstName();
                result += seprartor + "lastName" + seprartorValue + user.getLastName();
                if (user.getBirthDate() != null)
                {
                    result += seprartor + "birthDate" + seprartorValue + (new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")).format(user.getBirthDate());
                }
                result += seprartor + "isMale" + seprartorValue + user.isMale();
                result += seprartor + "country" + seprartorValue + user.getCountry();
                result += seprartorRow;
            }
            outputStream.write(result.getBytes());
        }

        public void load(InputStream inputStream) throws Exception
        {
            byte[] targetArray = new byte[inputStream.available()];
            inputStream.read(targetArray);
            if (targetArray.length == 0)
            {
                return;
            }
            for (String row : (new String(targetArray)).split(seprartorRow))
            {
                HashMap<String, String> attributes = new HashMap<>();
                for (String nameValue : row.split(seprartor))
                {
                    if (!nameValue.substring(nameValue.indexOf(seprartorValue) + seprartorValue.length()).equals("null"))
                    {
                        attributes.put(nameValue.substring(0, nameValue.indexOf(seprartorValue)), nameValue.substring(nameValue.indexOf(seprartorValue) + seprartorValue.length()));
                    }
                }
                User user = new User();
                if (attributes.containsKey("country"))
                {
                    user.setCountry(User.Country.valueOf(attributes.get("country")));
                }
                if (attributes.containsKey("birthDate"))
                {
                    user.setBirthDate((new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")).parse(attributes.get("birthDate")));
                }
                if (attributes.containsKey("firstName"))
                {
                    user.setFirstName(attributes.get("firstName"));
                }
                if (attributes.containsKey("lastName"))
                {
                    user.setLastName(attributes.get("lastName"));
                }
                if (attributes.containsKey("isMale"))
                {
                    user.setMale(Boolean.valueOf(attributes.get("isMale")));
                }

                users.add(user);
            }

        }
    }
}
