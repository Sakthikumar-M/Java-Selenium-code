package challenge;

public class day9_Java_share_price {

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		int buy_day = 2;
		int stock_price = arr[buy_day-1];
		
		for (int i = buy_day; i < arr.length; i++) {
			if(stock_price <arr[i]) {
				System.out.println(stock_price+"     "+arr[i]);
			}
		}

	}

}
