package fjnu.demo;

public class LoopShiftString {

	public static boolean judgeIsLoop(String sample,String matchString){
		
		char sampleArr[] = sample.toCharArray();
		char matchingArr[] = matchString.toCharArray();
		//如果两个字符串长度都不匹配，直接返回false
		if(sampleArr.length != matchingArr.length){
			return false;
		}
		for(int i = 0;i < matchingArr.length;i ++){
			if(new String(sampleArr).equals(new String(matchingArr))){
				return true;
			}
			for(int j = 0;j < matchingArr.length - 1;j ++){
				char temp = matchingArr[j];
				matchingArr[j] = matchingArr[j + 1];
				matchingArr[j + 1] = temp;
			}
			//System.out.println(new String(matchingArr));
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(judgeIsLoop("ABCD","BCDA"));
		System.out.println(judgeIsLoop("ABCD","CDAB"));
	}
	
}
