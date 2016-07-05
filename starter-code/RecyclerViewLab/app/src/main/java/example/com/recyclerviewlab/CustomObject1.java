package example.com.recyclerviewlab;

/**
 * Created by owlslubic on 7/5/16.
 */
public class CustomObject1 {
    String mTitle, mDescription, mColor;


    public CustomObject1(String title, String description, String color) {
     //he has it as this.mTitle = title..?
        mTitle = title;
        mDescription = description;
        mColor = color;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
}
