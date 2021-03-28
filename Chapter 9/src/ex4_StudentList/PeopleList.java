package ex4_StudentList;

import java.util.ArrayList;


    public  class PeopleList<T> {
        ArrayList<T> listPeople;

        public PeopleList() {
            listPeople = new ArrayList<T>();
        }

        public void add(T obj) {
            listPeople.add(obj);
        }

        public void display() {
            for (T objPeople : listPeople) {
                System.out.println(objPeople.toString());
            }
        }

        public int getSize() {
            return listPeople.size();
        }

        public boolean checkEmpty() {
            return (listPeople.size() == 0);
        }

        public T grab() {
            if (!checkEmpty()) {
                return listPeople.remove(0);
            } else
                return null;
        }
    }


