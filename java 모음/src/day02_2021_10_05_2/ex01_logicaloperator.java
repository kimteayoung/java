package day02_2021_10_05;

public class ex01_logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리연산자
		//and, or 연산 각각 수행애서 결과 확인
		boolean result = true && true ;
		System.out.println(result);
		result = true && false;
		System.out.println(result);

		// not  연산 ( ! )
		boolean var1 = false;
		System.out.println(var1);
		System.out.println(!var1);
		var1 = !var1;
		System.out.println(var1);
		
		// 영어, 수학 점수가 둘다 90점 이상이면 합격 ( true )
		int engScore = 95;
		int mathScore = 97;
		boolean result1 = false;
		result1 = engScore >= 90 && mathScore >= 90;
		System.out.println(result1);
		engScore = 80;
		result1 = engScore >= 90 && mathScore >= 90;
		System.out.println(result1);
	    // 회원가입을 할 때 id = myid, password = 1234 라고 가입하고
		// 나중에 로그인을 한다고 했을 때 id, pw율 모두 맞게 입력하면 로그인 성공 ( true )
		// 둘 중 하나라도 틀린 값을 입력했다면 로그인 실패 (false) 처리를 한다고 했을 때
        String id = "myid";
	    String password = "1234";
	    boolean loginResult = (id == "myid") && (password == "1234");
	    System.out.println(loginResult);
	    loginResult = (id == "asdsdfsaf") && (password == "1234");
	    System.out.println(loginResult);
	    
	    
	

	}

}
