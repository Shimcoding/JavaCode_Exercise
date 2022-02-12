import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest91 {

	public static void main(String[] args) {
		//예외 클래스 작성하기
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100); 
	}
}

class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE; //에러코드 저장값
	
	UnsupportedFuctionException(String msg, int err) {
		super(msg);
		ERR_CODE = err;
	}
	
	UnsupportedFuctionException(String msg) {
		this(msg, 100);
	}
	
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}