package marsaint.arshiva;

public class Button {

    private String title;
    private OnClickListener onClickListener;

    //constructor
    public Button(String title) {
        this.title = title;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    //getter
    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    //setter
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

}
