import quesion.data.OrderGiveProblem;
import quesion.data.Problem;
import quesion.data.TestPaper;

public class Main {
    public static void main(String[] args) {


        byte var1 = 80;
        OrderGiveProblem var2 = new OrderGiveProblem();
        TestPaper var3 = var2.getTestPaper("题库/第12章/判断题.data", var1);
//        TestPaper var3 = var2.getTestPaper("题库/第12章/选择题.data", var1);
//        TestPaper var3 = var2.getTestPaper("题库/第12章/挑错题.data", var1);
//        TestPaper var3 = var2.getTestPaper("题库/第12章/读程题.data", var1);
        Problem[] var4 = var3.getAllProblem();

        int var5;
        for(var5 = 0; var5 < var4.length; ++var5) {
            System.out.println(var4[var5].content);
            inputOne(var4[var5]);
            System.out.println();
        }

        for(var5 = 0; var5 < var4.length; ++var5) {
            if (var5 % 4 == 0) {
                var4[var5].userAnswer = "A";
            } else if (var5 % 4 == 1) {
                var4[var5].userAnswer = "B";
            } else if (var5 % 4 == 2) {
                var4[var5].userAnswer = "C";
            } else if (var5 % 4 == 3) {
                var4[var5].userAnswer = "D";
            }
        }

    }
    static void inputOne(Problem var0) {
//        System.out.printf("%s\t%s\t%s\t%s\n", var0.giveChoiceA, var0.giveChoiceB, var0.giveChoiceC, var0.giveChoiceD);
//        System.out.println("图像的名字" + var0.imageName);
        System.out.println("答案：" + var0.correctAnswer);
    }
}
