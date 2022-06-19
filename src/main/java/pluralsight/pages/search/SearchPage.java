package pluralsight.pages.search;

import pluralsight.pages.BasePage;

public class SearchPage extends BasePage {

    private SearchVerifyController verify;
    private SearchActController act;
    private SearchGetController get;


    public SearchGetController get() {
        return get;
    }

    public SearchVerifyController verify() {
        return verify;
    }

    public SearchActController act() {
        return act;
    }

    private SearchPage(SearchActController act, SearchVerifyController verify,SearchGetController get) {
        this.act = act;
        this.verify = verify;
        this.get=get;
    }

    public static SearchPage getSearchPage() {
        return new SearchPage(new SearchActController(), new SearchVerifyController(),new SearchGetController());
    }


}
