interface ConMemoria<T> {
	void reset();

	T[] historico();

	T[] historico(int ult);
}
