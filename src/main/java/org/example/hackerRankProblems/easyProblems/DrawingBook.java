package org.example.hackerRankProblems.easyProblems;

public class DrawingBook {
    public static void main(String[] args) {

        //PASSED ALL TEST!!!


//        System.out.println(pageCount(6, 2));
//
//        System.out.println(pageCount(100, 51));
//        System.out.println(pageCount(300, 3));
//        System.out.println(pageCount(300, 297));

        System.out.println(pageCount(18183, 18042));
    }

    public static int pageCount(int numberOfPages, int pageToTurnTo){
        int pagesForward = 0;
        int pagesBackward = 0;
        for(int i = 1; i < numberOfPages; i += 2){

            if(pageToTurnTo <= 1){
                return 0;
            }

            if(i >= pageToTurnTo){
                //pagesForward++;
                //System.out.println(pagesForward);
                break;
            } else {
                pagesForward++;
            }
        }
        System.out.println("pages forward " + pagesForward);

        for(int i = numberOfPages - 1; i > 0; i-=2){
            if(pageToTurnTo == numberOfPages){
                return 0;
            }
            if(numberOfPages % 2 == 1){
                if(pageToTurnTo == numberOfPages - 1){
                    return 0;
                }
            }

            if(numberOfPages % 2 == 0){
                if( pageToTurnTo == numberOfPages - 1){
                    return 1;
                }
            }
            if(i <= pageToTurnTo){
                //pagesBackward++;
                //System.out.println(pagesBackward);
                break;
            } else {
                pagesBackward++;
            }
        }

        System.out.println("Pages backwards " + pagesBackward);

        if(pagesForward == pagesBackward){
            return pagesForward;
        } else {
            return Math.min(pagesForward, pagesBackward);
        }


    }
}
