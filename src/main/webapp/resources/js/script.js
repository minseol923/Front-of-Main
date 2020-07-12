$('button.mobile, ul li a').click(function () {
    $('nav').toggleClass('mobile-nav');
});

/* BLUR EFFECT */

    var $container = $('.article_center2'),
        $articles = $container.children('article'),
        timeout;

    $articles.on('mouseenter', function(event) {
        var $article = $(this);
        clearTimeout(timeout);
        timeout = setTimeout(function() {
            if ($article.hasClass('active')) return false;
            $articles.not($article).removeClass('active').addClass('blur');
            $article.removeClass('blur').addClass('active');
        }, 75);
    });
    $('.article_center2', '#services ').on('mouseleave', function(event) {
        clearTimeout(timeout);
        $articles.removeClass('active blur');
    });


    $articles.bind('click', function(){
        var title = $(this).find('h3').text();
        alert("Nothing interesting,\nonly the actual title of the article = " + title);
    });


/* Moving Box */

$(".thumbnail").hover(function(){
  $(this).find(".thumbOverlay").fadeIn( 200 );
}, function(){
  $(this).find(".thumbOverlay").fadeOut( 200 );
});

//Remove all the lines below for default automatic transition
$('.carousel').carousel('pause');
$('.carousel-control-next').click(function(){
  $('.carousel').carousel('next');
});
$('.carousel-control-prev').click(function(){
  $('.carousel').carousel('prev');
});



