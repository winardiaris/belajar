public class TestRunner{
	public static void main(String[]args){
		try{
			System.out.println("URL : http://jsonplaceholder.typicode.com/posts/1");
			Data data = ParserJsonParserFromUrl.getData("http://jsonplaceholder.typicode.com/posts/1");
			System.out.println("Results : \n"+data);
			
			
			System.out.println("URL : http://jsonplaceholder.typicode.com/posts");
			List<Data> dataList = ParserJsonParserFromUrl.getDataList("http://jsonplaceholder.typicode.com/posts");
			System.out.println("List Size : \n"+dataList.size());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
