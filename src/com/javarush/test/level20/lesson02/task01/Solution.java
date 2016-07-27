package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
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

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (!somePerson.equals(ivanov))
            {
                throw new Exception();
            }
            inputStream.close();

        }
        catch (IOException e)
        {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human
    {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        private static String seprartor = "###";
        private static String seprartorValue = "$$$";

        public Human()
        {
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this.name.equals(((Human) obj).name) && assets.retainAll(((Human)obj).assets))
            {
                return true;
            }
            return false;
        }

        public Human(String name, Asset... assets)
        {
            this.name = name;
            if (assets != null)
            {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception
        {
            String result = new String(name);
            for (Asset asset : assets)
            {
                result += seprartor + asset.getName() + seprartorValue + asset.getPrice();
            }
            outputStream.write(result.getBytes());
        }

        public void load(InputStream inputStream) throws Exception
        {

            byte[] targetArray = new byte[inputStream.available()];
            inputStream.read(targetArray);

            String getter = new String(targetArray);
            if (getter.indexOf(seprartor) > 0)
            {
                name = getter.substring(0, getter.indexOf(seprartor));
                getter = getter.substring(getter.indexOf(seprartor) + seprartor.length());
                String[] asserArray = getter.split(seprartor, -1);
                for (String asset : asserArray)
                {
                    Asset assetObj = new Asset(asset.substring(0, asset.indexOf(seprartorValue)));
                    assetObj.setPrice(Double.parseDouble(asset.substring(asset.indexOf(seprartorValue) + seprartorValue.length())));
                    assets.add(assetObj);
                }
            } else
            {
                name = getter;
            }
        }
    }
}
