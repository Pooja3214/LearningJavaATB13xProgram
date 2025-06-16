package Programs;

public class TriangleClassifier {

    public static void main(String[] args) {
int a= 13, b=12, c=12;

if(a==b && b==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b || b==c)
        {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
