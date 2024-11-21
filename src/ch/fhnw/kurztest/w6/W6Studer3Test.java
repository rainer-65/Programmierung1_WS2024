package ch.fhnw.kurztest.w6;

class W6Studer3Test {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.createNumbers();
        numbers.findOddNumbers();
        System.out.println(numbers.getAllNumbers());
        System.out.println(numbers.getOddNumbers());

        System.out.println(numbers.getAllNumbers().size());
        System.out.println(numbers.getOddNumbers().size());
    }

}
