import java.util.Scanner;

class Main{
    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan. nextInt();
        int b = scan. nextInt();
        int c = scan. nextInt();
        int result = 0;
        
        if(a == b && b == c){    //세 개가 다 똑같을 때
            result = 10000 + a * 1000;
        } else if(a == b && (a != c || b != c)){    // a == b
            result = 1000 + a * 100;
        } else if(b == c && (b != a || c != a)){    // b == c
            result = 1000 + b * 100;
        } else if(c == a && (c != b || a != b)){    // c == a
            result = 1000 + a * 100;
        } else if(a != b && b != c && c != a) {    // 모두 다를 때
            result = (a > b) ? a : b;
            result = (result > c) ? result : c;
            result *= 100;
        }
        System.out.println(result);
	}
}