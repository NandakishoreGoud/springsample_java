package model;

public abstract class Syntax {
	ColorHighlighting colorHighlighting; 
	Bolding bolding;
	FontsCasing fontsCasing;
	public  Syntax() {
	}

	public void performColorHighlighitng() {
		colorHighlighting.colorHighlighitng();
	}
	public void performBolding() {
		bolding.bolding();
	}
	public void performFontsCasing() {
		fontsCasing.fontsCasing();
	}
	public void setColorHighliting(ColorHighlighting ch) {
	colorHighlighting = ch;
	}
	public void setBolding(Bolding b) {
		bolding = b;
	}
	
}
