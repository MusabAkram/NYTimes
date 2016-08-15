# android-nytimes-search
Project 3 for the Android CodePath project at Hearsay Social - Article search App utilizing NY Times API

- [x] User can enter a search query that will display a grid of news articles using the thumbnail and headline from the New York Times Search API. (3 points)
- [ ] User can click on "filter" icon which allows selection of advanced search options to filter articles. (3 points)
    An example of a query with filters (begin_date, sort, and news_desk) applied can be found here. Full details of the API can be found on this article search README.
        User can configure advanced search filters such as: (points included above)
            - Begin Date (using a date picker)
                - Sort order (oldest or newest) using a spinner dropdown
                    - News desk values (Arts, Fashion & Style, Sports) using checkboxes
                    - [ ] Subsequent searches will have any filters applied to the search results. (1 point)
                    - [x] User can tap on any article in results to view the contents in an embedded browser. (2 points)
                    - [ ] User can scroll down "infinitely" to continue loading more news articles. The maximum number of articles is limited by the API search. (1 point)

                    Extras:
                    - [ ] Robust error handling, check if internet is available, handle error cases, network failures. (1 point)
                    - [ ] Use the ActionBar SearchView or custom layout as the query box instead of an EditText. (1 point)
                    - [ ] User can share a link to their friends or email it to themselves. (1 point)
                    - [ ] Replace Filter Settings Activity with a lightweight modal overlay. (2 points)
                    - [ ] Improve the user interface and experiment with image assets and/or styling and coloring (1 to 3 points depending on the difficulty of UI improvements)
                    - [ ] Stretch: Use the RecyclerView with the StaggeredGridLayoutManager to display improve the grid of image results (see Picasso guide too). (2 points)
                    - [ ] Stretch: For different news articles that only have text or have text with thumbnails, use Heterogenous Layouts with RecyclerView. (2 points)
                    - [ ] Stretch: Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
                    - [ ] Stretch: Use Parcelable instead of Serializable using the popular Parceler library. (1 point)
                    - [ ] Stretch: Replace all icon drawables and other static image assets with vector drawables where appropriate. (1 point)
                    - [ ] Stretch: Leverage the data binding support module to bind data into one or more activity layout templates. (1 point)
                    - [ ] Stretch: Replace Picasso with Glide for more efficient image rendering. (1 point)
                    - [ ] Stretch: Switch to using retrolambda expressions to cleanup event handling blocks. (1 point)
                    - [ ] Stretch: Leverage the popular GSON library to streamline the parsing of JSON data. (1 point)
                    - [ ] Stretch: Consume the New York Times API using the popular Retrofit networking library instead of Android Async HTTP. (3 points)
