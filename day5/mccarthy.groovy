int mcCarthy91(int n) {
	if (n > 100) {
		return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
}

println mcCarthy91(73);