package learning;


    public class Book{
        private String writer;
        private int year;
        private String name;

        public Book() {
        }

        public Book(String writer, int year, String name) {
            this.writer = writer;
            this.year = year;
            this.name = name;
        }
        public void displayInfo(){
            System.out.println("Title:"+name+",Author:"+writer+",Year:"+year);
        }

    }
    

