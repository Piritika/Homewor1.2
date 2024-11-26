public class Figure {
    public static void main(String[] args) {
        String Vasya = "Вася";
        String Petya = "Петя";
        String FigureOne;
        String FigureTwo = "";
        String Stone = "камень";
        String Scissors = "ножницы";
        String Paper = "бумагу";

        int rnOne = (int) (Math.random() * 3);

        if (rnOne == 0) {
            FigureOne = Stone;
        }else{
            if (rnOne == 1){
                FigureOne = Scissors;
            }else {
                FigureOne = Paper;
            }
        }

        System.out.println(Vasya + " выкинул " + FigureOne);

        int rnTwo = (int) (Math.random() * 3);

        if (rnTwo == 0) {
            FigureTwo = Stone;
        }else{
            if (rnTwo == 1){
                FigureTwo = Scissors;
            }else {
                if (rnTwo == 2){
                    FigureTwo = Paper;
                }
            }
        }

        System.out.println(Petya + " выкинул " + FigureTwo);

        if (rnOne == rnTwo){
            System.out.println("Ничья! Выиграла дружба!");
        }else {
            if (rnOne == 0 && rnTwo == 1 || rnOne == 1 && rnTwo == 2 || rnOne == 2 && rnTwo == 0){
                System.out.println("Победил " + Vasya);
            }else {
                System.out.println("Победил " + Petya);
            }
        }

    }
}
