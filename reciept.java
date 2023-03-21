

public class recieptHandler
{
	public function post(String path)
	{
		return String id;
	}

	public function get(String path, String id)
	{
		JSONObject reciept = getReceipt(id);
		
		String retailer = receipt.getObject("retailer");
		int points = retailer.length();

		JSONArray items = receipt.getObject("items");
		int itemCount = 0;
		float priceTotal;
		while(items.getJSONObject(itemCount) != null)
		{
			String price = items.getJSONObject(itemCount).getObject("price");
			String priceFloat = Float.parseFloat(price);
			priceTotal = priceTotal + priceFloat;

			String shortDescription = items.getJSONObject(itemCount).getObject("shortDescription");
			String descTrim = shortDescription.trim();
			if(descTrim.length % 3 == 0)
			{
				int addedPointTotal = Math.ceil(priceFloat * .2)
				points = points + addedPointsTotal;
		}
		
		if(parseTotal % 1 == 0)
		{
			points = points + 50;
		}

		if(pointTotal % .25 == 0)
		{
			points = points + 25;
		}

		int itemTotal = itemCount + 1;
		float evenCount = itemTotal / 2;
		evenCount = Math.floor(evenCount);
		int addedPointTotal = evenCount * 5;
		points = points + addedPointTotal;

		String purchaseDate = receipt.getObject("purchaseDate");
		int dayOfMonth = Date(purchaseDate).getDayOfMonth();
		if(dayOfMonth % 2 != 0)
		{
			points = points + 6;
		}

		String purchaseTime = receipt.getObject("purchaseTime");
		Instant time = Instant.parse(purchaseTime);
		if(time.isBefore("4:00") && time.isAfter("2:00"))
		{
			points = points + 10;
		}

		return points;
)
	}
}