class Viewing {
    private Grasshopper viewer;
    private Video film;

    public Viewing(Grasshopper viewer, Video film) {
        this.viewer = viewer;
        this.film = film;
    }

    public Grasshopper getViewer() {
        return viewer;
    }

    public void setViewer(Grasshopper viewer) {
        this.viewer = viewer;
    }

    public Video getFilm() {
        return film;
    }

    public void setFilm(Video film) {
        this.film = film;
    }

    public void rate(Video.Rating rating) {
        film.setRating(rating);
    }


}
