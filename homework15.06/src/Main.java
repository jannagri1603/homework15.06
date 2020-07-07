public class Main {

    public static void main(String[] args) {
		byte a = 120;
		short b = 32245;
		int c = 77777;
		long d = -987654321L;
		float e = 10.10f;
		double f = 321.123;
		char g = '\ufffa';
		boolean h = true;

    }
    

	static int m3(int a, int b, int c, int d) {
	int s = a * (b + (c / d));
	return s;
	}

	static boolean m4 (int a, int b){
	int s = a + b;
	return (10 <= s) && (s <= 20);
	}

	static void m5 () {
	int a = 20;
	if (a < 0){
		System.out.println("Отрицатетльное");
	}
	else if (a >= 0) {
		System.out.println("Положительное");
		}
    }

	static boolean m6 (int a) {
    boolean b = true;
		if (a < 0) {
			}
		return b;
	}


	static void m7 (String name){
    System.out.println("Привет, " + name + "!");
        }


    static boolean m8 (int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        else {
             return false;
              }
    }


}















