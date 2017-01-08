package Beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 検索文字列(路線名・駅名)を保持するクラス
 *
 */
@Named
@RequestScoped
public class SearchStringDto {

    private String searchString;

    public String next() {
        return "output.xhtml";
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

}
