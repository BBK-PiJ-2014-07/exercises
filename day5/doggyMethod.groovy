String doggyMethod(int n) {
	if (n <= 0) {
		return "";
	}
	String result = doggyMethod(n-3) + n + doggyMethod(n-2);
	return result;
}

println doggyMethod(4);