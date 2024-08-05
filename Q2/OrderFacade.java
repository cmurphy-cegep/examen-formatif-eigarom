public class OrderFacade {
	Payment _payment;
	Shipping _shipping;
	Stock _stock;

	public OrderFacade() {
		_payment = new Payment();
		_shipping = new Shipping();
		_stock = new Stock();
	}

	public void placeOrder(String item, int quantity, String paymentDetails, String address) {
		if (_stock.checkStock(item, quantity)) {
			_stock.updateStock(item, quantity);
			_payment.processPayment(paymentDetails);
			_shipping.arrangeShipping(item, quantity, address);
		}
	}
}
