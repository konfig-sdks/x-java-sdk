package com.konfigthis.client;

import com.konfigthis.client.api.BookmarksApi;
import com.konfigthis.client.api.ComplianceApi;
import com.konfigthis.client.api.DirectMessagesApi;
import com.konfigthis.client.api.GeneralApi;
import com.konfigthis.client.api.ListsApi;
import com.konfigthis.client.api.SpacesApi;
import com.konfigthis.client.api.TweetsApi;
import com.konfigthis.client.api.UsersApi;

public class X {
    private ApiClient apiClient;
    public final BookmarksApi bookmarks;
    public final ComplianceApi compliance;
    public final DirectMessagesApi directMessages;
    public final GeneralApi general;
    public final ListsApi lists;
    public final SpacesApi spaces;
    public final TweetsApi tweets;
    public final UsersApi users;

    public X() {
        this(null);
    }

    public X(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bookmarks = new BookmarksApi(this.apiClient);
        this.compliance = new ComplianceApi(this.apiClient);
        this.directMessages = new DirectMessagesApi(this.apiClient);
        this.general = new GeneralApi(this.apiClient);
        this.lists = new ListsApi(this.apiClient);
        this.spaces = new SpacesApi(this.apiClient);
        this.tweets = new TweetsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
