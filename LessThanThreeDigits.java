public class LessThanThreeDigits {
	public static int isLovely(int num) {
		String temp= String.valueOf(num);
		int digit[]= new int[10];
		for(int i=0;i<temp.length();i++) {
			digit[(int)temp.charAt(i)-48]++;
		}
		for(int k: digit) {
			if(k>=3) {
				return -1;
			}
		}
		return 0;
	}
	
	public static int solution(int beg, int end) {
		int count=0;
		for(int i=beg;i<=end;i++) {
			if(isLovely(i)==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beg=1;
		int end=111;
		System.out.println(solution(beg, end));
		
	}
