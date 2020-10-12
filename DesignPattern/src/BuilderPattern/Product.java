package BuilderPattern;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

	private final Long id;
	private final String name;
	private final LocalDateTime date;
	private final boolean stock;
	private final String description;
	private final BigDecimal price;
	
	
	
	public static class Builder{
		
		private  Long id;
		private  String name;
		private  LocalDateTime date;
		private  boolean stock;
		private  String description;
		private  BigDecimal price;
		
		public Builder addId(Long id)
		{
			this.id=id;
			return this;
			
		}
		
		public Builder addName(String name)
		{
			this.name=name;
			return this;
			
		}
		public Builder addDate(LocalDateTime date)
		{
			this.date=date;
			return this;
			
		}
		public Builder addStock(Boolean stock)
		{
			this.stock=stock;
			return this;
			
		}
		public Builder addDescription(String description )
		{
			this.description=description;
			return this;
			
		}
		
		public Builder addPrice(BigDecimal price)
		{
			this.price=price;
			return this;
			
		}
		public Product builder()
		{
			return new Product(this);
		}
		
	}
	
	private Product(Builder builder)
	{
		this.date=builder.date;
		this.id=builder.id;
		this.name=builder.name;
		this.description=builder.description;
		this.price=builder.price;
		this.stock=builder.stock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", date=" + date + ", stock=" + stock + ", description="
				+ description + ", price=" + price + "]";
	}
	
	
}
