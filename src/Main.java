public class Main {
    public static void main(String[] args) {
 //       System.out.println("задание 1");
//        int ihave = 0;
 //       int manyback = 15000;
 //       for (int i = 0 ; ihave<2459000; i++){
// ihave += manyback;
 //           System.out.println("Месяцев " +i);
 //       }
 //       System.out.println("задание 2");
//        for (int i =10; i>=1; i--){
 //           System.out.print( " "+i );
 //       }
 //       System.out.println("");
 //       int i = 0;
 //      while (i<10){
  //          i++;
  //          System.out.print(" "+i);
//        }
  //      System.out.println("задание 3 ");
//        int total = 12000000;
//        int born = 17;
//        int deth = 8;
 //       int ecototal = born- deth;
 //       for (int i = 1;i<=10; i++){
 //           total =total + total * ecototal/1000;
//            System.out.println("Год " + i + " численость населения состовляет "+ total);
//        }
        System.out.println("задание 4");
int ferstsum=0;
        int vasilyisum =15000;

                int yaers =9;

        for (int i = 1;i <=(12*yaers);i++  ) {
            ferstsum = (int) (ferstsum + vasilyisum * 1.07);
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " днеги " + ferstsum);
            }

        }
        System.out.println("задание 5");
        int friday = 5;
        for (int i = 1; i<=31;++i){
            if (i % 7 == friday){
                System.out.println("сегодня пятница "+i+ " необходимо приготовить отчет ");
            }
        }
        System.out.println("Задание 6");
        int rocketflyyear= 79;
        int start =1;
for(int i = 1;i <= 2100;i++){
    start=rocketflyyear+rocketflyyear;
    if( i ==start){

        System.out.println(start );
    }


        }
        System.out.println("задание 7");
for(int i = 1; i<=10;i++ ){
    int b = 2 *i;
    System.out.println("2*"+i+"="+b);


}



    }
    }
