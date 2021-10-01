
public class Stock {

		private String symbol;
		private String companyName;
		private double price;
		
		
		public Stock() {
			
			symbol = "";
			companyName = "";
			price = 0;
	}
		
	public Stock(String symbol, String companyName, double price) {
		this.symbol = symbol;
		this.companyName = companyName;
		this.price = price;
	}
		//since using same name, if not you can do 
		//symbol = s;, companyName = cn;, price = p; etc
		
		//setters and getters
		
		public String getsymbol() {
			return this.symbol;
		}
		
		public String getcompanyName() {
			return companyName;
		}
		
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		
		public double getPrice() {
				return price;
			}
			
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		public void setsymbol(String symbol) {
			this.symbol = symbol;
		}
		
		public double computePurchaseCost(int shares) {
			return price * shares;
		}
	}
		
		



