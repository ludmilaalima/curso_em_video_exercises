class Viewing {
    private Grasshopper viewer;
    private Video film;

    public Viewing(Grasshopper viewer, Video film) {
        this.viewer = viewer;
        this.film = film;
        this.viewer.setTotalWatched(viewer.getTotalWatched() + 1);
        this.film.setViews(this.film.getViews() + 1);
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

    @Override
    public String toString() {
        return String.format(
        "\n==============================\n" +
        "Espectador: %s\n" +
        "Filme assistido: %s\n" +
        "Visualizações do filme: %d\n" +
        "Total de filmes assistidos pelo espectador: %d\n" +
        "==============================",
        getViewer(), getFilm(), this.film.getViews(), this.viewer.getTotalWatched());


    }





}
