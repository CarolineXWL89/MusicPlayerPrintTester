import java.util.ArrayList;

/**
 * Created by princ on 26/10/2017.
 */
public class MainClass {
    public static void main(String[] args){
        //strings.xml for HTML
        /*HTMLReaderTest htmlReaderTest = new HTMLReaderTest("\n" +
                "\n" +
                "<!doctype html>\n" +
                "<!--[if lt IE 7]> <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if IE 7]>    <html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if IE 8]>    <html class=\"no-js lt-ie9\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"en\"> <!--<![endif]--><head>\n" +
                "\n" +
                "<!-- DFP head code - START -->\n" +
                "<script>\n" +
                "var PREBID_TIMEOUT = 1000;\n" +
                "var MAX_RETRIES = 20;\n" +
                "var EXCHANGE_RATE = 3.5;\n" +
                "var pbjs = pbjs || {};\n" +
                "pbjs.que = pbjs.que || [];\n" +
                "\n" +
                "var googletag = googletag || {};\n" +
                "googletag.cmd = googletag.cmd || [];\n" +
                "\n" +
                "function detectWidth() {var w = window,d = document, e = d.documentElement, x = screen.width || e.offsetWidth || e.clientWidth;return x;}\n" +
                "var screenSizeMobile = 768;\n" +
                "function initHBS() {\n" +
                "  if (pbjs.initAdserverSet) return;\n" +
                "  loadScript('//www.googletagservices.com/tag/js/gpt.js');\n" +
                "  pbjs.initAdserverSet = true;\n" +
                "}\n" +
                "setTimeout(initHBS, PREBID_TIMEOUT);\n" +
                "\n" +
                "if (detectWidth() < screenSizeMobile) {\n" +
                "      googletag.cmd.push(function () {\n" +
                "         googletag.pubads().setTargeting(\"device\", \"mobile\");\n" +
                "      });\n" +
                "    loadScript('https://www.lyrics.com/adunits/prebid-mobile.js');\n" +
                "} else {\n" +
                "      googletag.cmd.push(function () {\n" +
                "         googletag.pubads().setTargeting(\"device\", \"desktop\");\n" +
                "      });\n" +
                "    loadScript('https://www.lyrics.com/adunits/prebid-desktop.js');\n" +
                "}\n" +
                "\n" +
                "function loadScript(scriptSrc) {\n" +
                "  var script = document.createElement('script');\n" +
                "  script.async=true;\n" +
                "  script.type = 'text/javascript';\n" +
                "  script.src = scriptSrc;\n" +
                "  var node = document.getElementsByTagName('script')[0];\n" +
                "  node.parentNode.insertBefore(script, node);\n" +
                "}\n" +
                "\n" +
                "pbjs.que.push(function() {\n" +
                "  pbjs.bidderSettings = {\n" +
                "    standard: {\n" +
                "      adserverTargeting: [{\n" +
                "        key: \"hb_bidder\",\n" +
                "        val: function(bidResponse) {\n" +
                "         return bidResponse.bidderCode;\n" +
                "       }\n" +
                "      }, {\n" +
                "        key: \"hb_adid\",\n" +
                "        val: function(bidResponse) {\n" +
                "         return bidResponse.adId;\n" +
                "       }\n" +
                "      }, {\n" +
                "        key: \"hb_pb\",\n" +
                "        val: function(bidResponse) {\n" +
                "         if(bidResponse.cpm >= 80) return '80.00';\n" +
                "         return (Math.floor(bidResponse.cpm * 4) / 4).toFixed(2);\n" +
                "       }\n" +
                "      }, {\n" +
                "         key: 'hb_size',\n" +
                "         val: function (bidResponse) {\n" +
                "            return bidResponse.size;\n" +
                "         }\n" +
                "      }]\n" +
                "    },\n" +
                "    sekindoA:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE * .75;\n" +
                "      }\n" +
                "    },\n" +
                "    aol:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    sovrn:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    sekindoUM:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    pulsepoint:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    districtmDMX:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    rhythmone:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    rubicon:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE  * .75;\n" +
                "      }\n" +
                "    },\n" +
                "    brealtime:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE * .85;\n" +
                "      }\n" +
                "    },\n" +
                "    indexExchange:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    appnexus:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    }\n" +
                "  };\n" +
                "});\n" +
                "</script>\n" +
                "\n" +
                "<script>\n" +
                "var mapSizeMRU = [[300, 250], [300, 600]];\n" +
                "if(detectWidth() < screenSizeMobile) mapSizeMRU = [[300, 250]];\n" +
                "\n" +
                "  googletag.cmd.push(function() {\n" +
                "    googletag.defineSlot('/52304935/Lyrics_IA_300x250_A', [300, 250], 'div-gpt-ad-Lyrics_IA_300x250_A').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_IA_300x250_B', [300, 250], 'div-gpt-ad-Lyrics_IA_300x250_B').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_A', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_A').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_B', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_B').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_C', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_C').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_D', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_D').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_125x125', [125, 125], 'div-gpt-ad-Lyrics_LR_125x125').addService(googletag.pubads());\n" +
                "\n" +
                "    googletag.defineSlot('/52304935/Lyrics_1x1_Slider', [1, 1], 'div-gpt-ad-Lyrics_1x1_Slider').addService(googletag.pubads());\n" +
                "    \n" +
                "    pbjs.que.push(function () {\n" +
                "      pbjs.setTargetingForGPTAsync();\n" +
                "    });\n" +
                "\n" +
                "    googletag.pubads().enableSingleRequest();\n" +
                "    googletag.pubads().collapseEmptyDivs();\n" +
                "    googletag.enableServices();\n" +
                "  });\n" +
                "\n" +
                "</script>\n" +
                "<!-- DFP head code - END --><meta charset=\"utf-8\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "<title>Lyrics containing the term: rising back up on the street</title>\n" +
                "<meta name=\"description\" content=\"A list of lyrics, artists and songs that contain the term &quot;rising back up on the street&quot; - from the Lyrics.com website.\">\n" +
                "<meta name=\"keywords\" content=\"rising back up on the street lyrics, rising back up on the street lyric, rising back up on the street songs, rising back up on the street artists, lyrics for rising back up on the street\">\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width\">\n" +
                "<base href=\"https://www.lyrics.com/\">\n" +
                "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Droid+Sans:400,700|Droid+Serif:400,700,400italic,700italic|Droid+Sans+Mono|Yanone+Kaffeesatz:200,300,400,700|Goudy+Bookletter+1911|Lobster+Two:400,700,400italic,700italic|Original+Surfer|\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/bootstrap.min.css\">\n" +
                "<!--<link rel=\"stylesheet\" href=\"--><!--/app_common/css/normalize.css\">-->\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/smoothness/jquery-ui-1.11.3.custom.min.css\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/lyrc.css\">\n" +
                "<!--[if lt IE 9]> <link rel=\"stylesheet\" href=\"root/app_common/css/lyrc-ie8.css\"> <![endif]-->\n" +
                "<!--[if lt IE 8]> <link rel=\"stylesheet\" href=\"root/app_common/css/lyrc-ie7.css\"> <![endif]-->\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/helpers.css\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/media.css\">\n" +
                "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"root/app_common/img/favicon_lyrc.ico\">\n" +
                "<link rel=\"search\" type=\"application/opensearchdescription+xml\" title=\"Lyrics.com\" href=\"https://www.lyrics.com/open-search.xml\">\n" +
                "\n" +
                "<!--[if lt IE 9]>\n" +
                "<script src=\"root/app_common/js/libs/modernizr-2.8.3.custom.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/html5shiv.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/respond.min.js\"></script>\n" +
                "<![endif]--><script type=\"text/javascript\">\n" +
                "  var _gaq = _gaq || [];\n" +
                "  _gaq.push(['_setAccount', 'UA-172613-15']);\n" +
                "  _gaq.push(['_trackPageview']);\n" +
                "  (function() {\n" +
                "    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n" +
                "    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
                "    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n" +
                "  })();\n" +
                "</script><meta property=\"fb:app_id\" content=\"118234861672613\"/>\n" +
                "<meta name=\"google-signin-client_id\" content=\"567628204450-49mrbnlqde6k322k6j1nmpstf86djv24.apps.googleusercontent.com\">\n" +
                "\n" +
                "\t<meta property=\"og:url\" content=\"https://www.lyrics.com/lyrics/rising%20back%20up%20on%20the%20street\" />\n" +
                "\t<link rel=\"canonical\" href=\"https://www.lyrics.com/lyrics/rising%20back%20up%20on%20the%20street\" />\n" +
                "\n" +
                "</head>\n" +
                "<body id=\"s4-page-serp\" data-fb=\"118234861672613\" data-atp=\"ra-4f75bf3d5305fac2\">\n" +
                "<!--[if lt IE 7]><p class=chromeframe>Your browser is <em>ancient!</em> <a href=\"http://browsehappy.com/\">Upgrade to a different browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">install Google Chrome Frame</a> to experience this site.</p><![endif]-->\n" +
                "\n" +
                "<div id=\"fb-root\"></div>\n" +
                "<script>(function(d, s, id) {\n" +
                "  var js, fjs = d.getElementsByTagName(s)[0];\n" +
                "  if (d.getElementById(id)) return;\n" +
                "  js = d.createElement(s); js.id = id;\n" +
                "  js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=118234861672613&version=v2.3\";\n" +
                "  fjs.parentNode.insertBefore(js, fjs);\n" +
                "}(document, 'script', 'facebook-jssdk'));</script>\n" +
                "\n" +
                "<div id=\"page-container\">\n" +
                "<header id=\"header\">\n" +
                "\t<div id=\"header-int\" class=\"clearfix\">\t\t\n" +
                "\t\t\t\t\t<div id=\"user-login\"><a href=\"login.php\">Login</a></div>\n" +
                "\t\t\t\t<div id=\"network-header\"><span id=\"network-header-trigger\">The&nbsp;STANDS4&nbsp;Network<span class=\"arw\">&#9776;</span></span>\n" +
                "\t<ul id=\"network-header-links\" style=\"display:none;\">\n" +
                "\t\t<li class=\"nw-abbreviations\"><a href=\"http://www.abbreviations.com/\">ABBREVIATIONS</a></li>\n" +
                "\t\t<li class=\"nw-anagrams\"><a href=\"http://www.anagrams.net/\">ANAGRAMS</a></li>\n" +
                "\t\t<li class=\"nw-biographies\"><a href=\"http://www.biographies.net/\">BIOGRAPHIES</a></li>\n" +
                "\t\t<li class=\"nw-convert\"><a href=\"http://www.convert.net/\">CONVERSIONS</a></li>\n" +
                "\t\t<li class=\"nw-definitions\"><a href=\"http://www.definitions.net/\">DEFINITIONS</a></li>\n" +
                "\t\t<li class=\"nw-grammar\"><a href=\"http://www.grammar.com/\">GRAMMAR</a></li>\n" +
                "\t\t<li class=\"nw-lyrics\"><a href=\"http://www.lyrics.com/\">LYRICS</a></li>\n" +
                "\t\t<li class=\"nw-phrases\"><a href=\"http://www.phrases.net/\">PHRASES</a></li>\n" +
                "\t\t<li class=\"nw-poetry\"><a href=\"http://www.poetry.net/\">POETRY</a></li>\n" +
                "\t\t<li class=\"nw-quotes\"><a href=\"http://www.quotes.net/\">QUOTES</a></li>\n" +
                "\t\t<li class=\"nw-references\"><a href=\"http://www.references.net/\">REFERENCES</a></li>\n" +
                "\t\t<li class=\"nw-rhymes\"><a href=\"http://www.rhymes.net/\">RHYMES</a></li>\n" +
                "\t\t<li class=\"nw-scripts\"><a href=\"http://www.scripts.com/\">SCRIPTS</a></li>\n" +
                "\t\t<li class=\"nw-symbols\"><a href=\"http://www.symbols.com/\">SYMBOLS</a></li>\n" +
                "\t\t<li class=\"nw-synonyms\"><a href=\"http://www.synonyms.net/\">SYNONYMS</a></li>\n" +
                "\t\t<li class=\"nw-uszip\"><a href=\"http://www.uszip.com/\">USZIP</a></li>\n" +
                "\t</ul>\n" +
                "</div>\t</div>\n" +
                "</header><div id=\"main\" role=\"main\" class=\"container\">\n" +
                "<div id=\"content-top\" class=\"content-top\">\n" +
                "\t<div class=\"view-desktop hidden-xs\">\n" +
                "\t\t<form id=\"search-frm\" method=\"get\" action=\"subserp.php\">\n" +
                "<div id=\"page-top-search\" class=\"rc5\">\n" +
                "\t<div id=\"page-word-search\">\n" +
                "\t\t<input type=\"text\" id=\"page-word-search-query\" class=\"rc5\" name=\"st\" value=\"rising back up on the street\" placeholder=\"Search for lyrics or artists...\" autocomplete=\"off\">\n" +
                "\t\t<div id=\"page-word-search-icon\"></div>\n" +
                "\t\t<button type=\"submit\" class=\"btn primary\" id=\"page-word-search-button\">Search</button>\n" +
                "\t</div>\n" +
                "\t<div id=\"page-word-search-ops\">\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op1\" value=\"1\" checked=\"checked\"><label for=\"page-word-search-op1\"><span>in Lyrics</span></label></div>\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op2\" value=\"2\"><label for=\"page-word-search-op2\"><span>in Artists</span></label></div>\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op3\" value=\"3\"><label for=\"page-word-search-op3\"><span>in Albums</span></label></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div id=\"page-letter-search\" class=\"rc5\"><a href=\"/artists/0\">#</a><a href=\"/artists/A\">A</a><a href=\"/artists/B\">B</a><a href=\"/artists/C\">C</a><a href=\"/artists/D\">D</a><a href=\"/artists/E\">E</a><a href=\"/artists/F\">F</a><a href=\"/artists/G\">G</a><a href=\"/artists/H\">H</a><a href=\"/artists/I\">I</a><a href=\"/artists/J\">J</a><a href=\"/artists/K\">K</a><a href=\"/artists/L\">L</a><a href=\"/artists/M\">M</a><a href=\"/artists/N\">N</a><a href=\"/artists/O\">O</a><a href=\"/artists/P\">P</a><a href=\"/artists/Q\">Q</a><a href=\"/artists/R\">R</a><a href=\"/artists/S\">S</a><a href=\"/artists/T\">T</a><a href=\"/artists/U\">U</a><a href=\"/artists/V\">V</a><a href=\"/artists/W\">W</a><a href=\"/artists/X\">X</a><a href=\"/artists/Y\">Y</a><a href=\"/artists/Z\">Z</a><span class=\"vbar\">&nbsp;</span><a href=\"justadded.php\" class=\"z\">NEW</a><a href=\"random.php\" class=\"z\">RANDOM</a></div>\n" +
                "</form>\t\t<div id=\"page-top-logo\" onclick=\"location.href='https://www.lyrics.com/';\"><img src=\"root/app_common/img/top_logo_lyr.png\" alt=\"Lyrics.com\" title=\"Lyrics.com\"></div>\n" +
                "\t</div>\n" +
                "\t<div class=\"view-mobile visible-xs\">\n" +
                "\t\t<form id=\"search-frm\" method=\"get\" action=\"subserp.php\">\n" +
                "\t<div id=\"page-top-search\" class=\"rc5\">\n" +
                "\t\t<div id=\"page-word-search\">\n" +
                "\t\t\t<input type=\"text\" id=\"page-word-search-query\" class=\"rc5\" name=\"st\" value=\"rising back up on the street\" autocomplete=\"off\">\n" +
                "\t\t\t<div id=\"page-word-search-icon\"></div>\n" +
                "\t\t\t<button type=\"submit\" class=\"btn primary\" id=\"page-word-search-button\">Search</button>\n" +
                "\t\t</div>\n" +
                "\t\t<div id=\"page-word-search-ops\">\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op1\" value=\"1\" checked=\"checked\"><label for=\"page-word-search-m-op1\"><span>in Lyrics</span></label></div>\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op2\" value=\"2\"><label for=\"page-word-search-m-op2\"><span>in Artists</span></label></div>\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op3\" value=\"3\"><label for=\"page-word-search-m-op3\"><span>in Albums</span></label></div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\t<div id=\"page-letter-search\" class=\"rc5\"><a href=\"/quotes/0\">#</a><a href=\"/quotes/A\">A</a><a href=\"/quotes/B\">B</a><a href=\"/quotes/C\">C</a><a href=\"/quotes/D\">D</a><a href=\"/quotes/E\">E</a><a href=\"/quotes/F\">F</a><a href=\"/quotes/G\">G</a><a href=\"/quotes/H\">H</a><a href=\"/quotes/I\">I</a><a href=\"/quotes/J\">J</a><a href=\"/quotes/K\">K</a><a href=\"/quotes/L\">L</a><a href=\"/quotes/M\">M</a><a href=\"/quotes/N\">N</a><a href=\"/quotes/O\">O</a><a href=\"/quotes/P\">P</a><a href=\"/quotes/Q\">Q</a><a href=\"/quotes/R\">R</a><a href=\"/quotes/S\">S</a><a href=\"/quotes/T\">T</a><a href=\"/quotes/U\">U</a><a href=\"/quotes/V\">V</a><a href=\"/quotes/W\">W</a><a href=\"/quotes/X\">X</a><a href=\"/quotes/Y\">Y</a><a href=\"/quotes/Z\">Z</a><span class=\"vbar\">&nbsp;</span><a href=\"justadded.php\" class=\"z\">NEW</a><a href=\"random.php\" class=\"z\">RANDOM</a></div>\n" +
                "</form>\t\t<div id=\"page-top-logo\" onclick=\"location.href='https://www.lyrics.com/';\"><img src=\"root/app_common/img/top_logo_lyr.png\" alt=\"Lyrics.com\" title=\"Lyrics.com\"></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"row\">\n" +
                "\t\n" +
                "\t<div id=\"content-main\" class=\"col-sm-8 col-sm-push-4\">\n" +
                "\t\t\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-12\">\n" +
                "\t\t\t\t<div class=\"category-header clearfix\">\n" +
                "\t\t\t\t\t<div class=\"sub-category-header-icon hidden-xs\"><i class=\"fa fa-music fa-4x\"></i></div>\n" +
                "\t\t\t\t\t<hgroup>\n" +
                "\t\t\t\t\t\t<div style=\"position:relative;float:right;top:1px;right:1px\"><div class=\"fb-like\" data-href=\"\" data-width=\"\" data-height=\"\" data-colorscheme=\"light\" data-layout=\"button_count\" data-action=\"like\" data-show-faces=\"true\" data-send=\"false\"></div></div>\t\t\t\t\t\t<h3><a href=\"signup.php\">Lyrics.com&nbsp;&raquo;</a></h3>\n" +
                "\t\t\t\t\t\t<h2>Search results for 'rising back up on the street'</h2>\n" +
                "\t\t\t\t\t\t<h4>Yee yee! We've found <strong>16,705</strong> lyrics, <strong>103</strong> artists, and <strong>100</strong> albums matching <strong>rising back up on the street</strong>.</h4>\n" +
                "\t\t\t\t\t</hgroup>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<div id=\"content-body\" class=\"row\">\n" +
                "\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-12\">\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"adunit-middle adunit-middle-2col clearfix\">\n" +
                "\t\t\t\t\t\t<div class=\"hidden-xs col-xs-12 col-sm-6\"><!-- /52304935/Lyrics_IA_300x250_B -->\n" +
                "<div id='div-gpt-ad-Lyrics_IA_300x250_B'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_IA_300x250_B'); });\n" +
                "</script>\n" +
                "</div></div>\n" +
                "\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6\"><!-- /52304935/Lyrics_IA_300x250_A -->\n" +
                "<div id='div-gpt-ad-Lyrics_IA_300x250_A'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_IA_300x250_A'); });\n" +
                "</script>\n" +
                "</div></div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<div>\n" +
                "\t\t\t\t\t\t\t<h3>Artists:</h3>\n" +
                "\t\t\t\t\t\t\t<p class=\"serp-flat-list\"><a href=\"artist/Back%20Street%20Crawler/15585\">Back Street Crawler</a> &middot; <a href=\"artist/Back%20Street%20Boys/484465\">Back Street Boys</a> &middot; <a href=\"artist/Vengeance%20Rising/14626\">Vengeance Rising</a> &middot; <a href=\"artist/Rising%20Sons/20194\">Rising Sons</a> &middot; <a href=\"artist/The%20Rising%20Storm/24817\">The Rising Storm</a> &middot; <a href=\"artist/Mercury%20Rising/293746\">Mercury Rising</a> &middot; <a href=\"artist/Rising%20Tide/310125\">Rising Tide</a> &middot; <a href=\"artist/Yngwie%20J.%20Malmsteen%27s%20Rising%20Force/424624\">Yngwie J. Malmsteen's Rising Force</a> &middot; <a href=\"artist/Antigone%20Rising/430155\">Antigone Rising</a> &middot; <a href=\"artist/Phoenix%20Rising/477048\">Phoenix Rising</a> &middot; <a href=\"sub_artist.php?name=Robbers+on+High+Street\">Robbers on High Street</a> &middot; <a href=\"sub_artist.php?name=BACK-ON\">BACK-ON</a> &middot; <a href=\"sub_artist.php?name=Laid+Back\">Laid Back</a> &ndash; <strong><a href=\"serp.php?st=rising+back+up+on+the+street&o=1&qtype=2\">and 93 other artists &raquo;</a></strong></p>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<div>\n" +
                "\t\t\t\t\t\t\t<h3>Albums:</h3>\n" +
                "\t\t\t\t\t\t\t<p class=\"serp-flat-list\"><a href=\"/album/652836\">Street Giveth...And the Street Taketh Away [Bonus Tracks]</a> (Cat Mother & The All Night News Boys) &middot; <a href=\"/album/1942880\">21 Jump Street: 13 Brand Hot Street Hits!</a> (Hutchinson, Hutch) &middot; <a href=\"/album/350865\">52nd Street: Street of Jazz</a> (Hutchinson, Hutch) &middot; <a href=\"/album/137784\">Back Street</a> (Lou Donaldson) &middot; <a href=\"/album/366136\">Back on the Street Again</a> (Laurel Canyon Ramblers) &middot; <a href=\"/album/39756\">Beauty on a Back Street</a> (Daryl Hall & John Oates) &middot; <a href=\"/album/386924\">Street Jams: Back 2 the Old Skool [Box]</a> (Hutchinson, Hutch) &middot; <a href=\"/album/639377\">Live in Europe 73: Living in a Back Street</a> (Spencer Davis) &middot; <a href=\"/album/491416\">Back on the Street</a> (Cockney Rejects) &middot; <a href=\"/album/637083\">Back to Beale Street</a> (Holly Shelton) &ndash; <strong><a href=\"serp.php?st=rising+back+up+on+the+street&o=1&qtype=3\">and 90 other albums &raquo;</a></strong></p>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/5021813/CKY/Eye+of+the+Tiger\">Eye of the Tiger</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/CKY/441362\">CKY</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/550396\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/550396\">CKY, Vol. 2</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/CKY/441362\">CKY</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2001</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/5021813/CKY/Eye+of+the+Tiger';\"><em>Rising</em> <em>up</em>, <em>back</em> on the <em>streets</em>!\n" +
                "Took my time, took my chances! \n" +
                "\n" +
                "Now I'm here, prepared to survive,\n" +
                "Want to stay alive, fuck you, die!</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/6344162/Steve+Winwood/Phoenix+Rising\">Phoenix Rising</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Steve%20Winwood/5854\">Steve Winwood</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/645515\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/645515\">About Time</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Steve%20Winwood/5854\">Steve Winwood</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2003</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/6344162/Steve+Winwood/Phoenix+Rising';\"><em>up</em> from the <em>street</em>\n" +
                "\n" +
                "Phoenix <em>rising</em>, Phoenix <em>rising</em>, Phoenix <em>rising</em>\n" +
                "Hear the beat, feel the heat\n" +
                "Phoenix <em>rising</em>, Phoenix <em>rising</em>, Phoenix <em>rising</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/2766927/Robert+Palmer/Dreams+Come+True\">Dreams Come True</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Robert%20Palmer/5096\">Robert Palmer</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/204198\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/204198\">Honey</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Robert%20Palmer/5096\">Robert Palmer</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1994</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/2766927/Robert+Palmer/Dreams+Come+True';\">before my eyes\n" +
                "As the hours pass before me\n" +
                "\n" +
                "When you're lustful, when you're lonely\n" +
                "And the heat is <em>rising</em> slowly\n" +
                "\n" +
                "I keep reaching <em>up</em>\n" +
                "But they drag me <em>back</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/1992069/The+The/Dogs+of+Lust\">Dogs of Lust</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/The%20The/5628\">The The</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/58675\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/58675\">Dusk</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/The%20The/5628\">The The</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1993</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/1992069/The+The/Dogs+of+Lust';\">As the hours pass before my eyes.\n" +
                "As the hours pass before me.\n" +
                "\n" +
                "When you're lustful. when you're lonely.\n" +
                "& the heat is <em>rising</em> slowly.\n" +
                "\n" +
                "I keep reaching <em>up</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/28018448/The+Killers/The+Rising+Tide\">The Rising Tide</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/The%20Killers/643632\">The Killers</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2534630\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2534630\">Battle Born</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/The%20Killers/643632\">The Killers</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2012</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/28018448/The+Killers/The+Rising+Tide';\">the truth's gonna come and cut me open wide\n" +
                "And you can't escape the <em>rising</em> of the tide\n" +
                "\n" +
                "Keep <em>up</em> your appearance; you're joining the choir\n" +
                "With everybody</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/2010093/AC%2FDC/Rising+Power\">Rising Power</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/AC%2FDC/3496\">AC/DC</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/86\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/86\">Flick of the Switch</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/AC%2FDC/3496\">AC/DC</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1983</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/2010093/AC%2FDC/Rising+Power';\"><em>Rising</em> power\n" +
                "We'll raise the night\n" +
                "<em>Rising</em> power\n" +
                "<em>Rising</em> power\n" +
                "We'll wake the dead\n" +
                "<em>Rising</em> power\n" +
                "\n" +
                "You've got a love life <em>up</em> all night\n" +
                "Darkest hour</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/256854/Bruce+Springsteen/Mansion+on+the+Hill\">Mansion on the Hill</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/18765\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/18765\">Nebraska</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1982</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/256854/Bruce+Springsteen/Mansion+on+the+Hill';\">The mansion on the hill\n" +
                "\n" +
                "At night my daddy'd take me and we'd ride\n" +
                "Through the <em>streets</em> of a town so silent and still\n" +
                "Park on a <em>back</em> road along the highway</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/3530293/Stray+Cats/Broken+Man\">Broken Man</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Stray%20Cats/5545\">Stray Cats</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/19222\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/19222\">Rock Therapy</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Stray%20Cats/5545\">Stray Cats</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1986</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/3530293/Stray+Cats/Broken+Man';\">packed <em>up</em> his bags and he headed west\n" +
                "With a dream in his pocket he would ride\n" +
                "The heat was <em>rising</em> on the desert sand\n" +
                "From the truth he couldn't hide</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/8866779/The+Other/Shadows+from+the+Past\">Shadows from the Past</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/The%20Other/676980\">The Other</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/836530\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/836530\">We Are Who We Eat</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/The%20Other/676980\">The Other</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2006</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/8866779/The+Other/Shadows+from+the+Past';\">And The Graves That\n" +
                "Weren't Closed\n" +
                "These Troubled Times Is When They Return, Packs Are\n" +
                "Marching The <em>Streets</em> And Leading The Dumb\n" +
                "\n" +
                "An Eternal Night\n" +
                "\n" +
                "Deadâ?¦<em>rising</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/4647475/Bruce+Springsteen/Mansion+on+the+Hill\">Mansion on the Hill</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Bruce%20Springsteen%20%26%20the%20E%20Street%20Band/186335\">Bruce Springsteen & the E Street Band</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/524928\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/524928\">Live in NYC</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2001</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/4647475/Bruce+Springsteen/Mansion+on+the+Hill';\">The mansion on the hill\n" +
                "\n" +
                "At night my daddy'd take me and we'd ride\n" +
                "Through the <em>streets</em> of a town so silent and still\n" +
                "Park on a <em>back</em> road along the highway</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/9572527/Bruce+Springsteen/Mansion+on+the+Hill\">Mansion on the Hill</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/918961\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/918961\">The Collection [#2]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2004</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/9572527/Bruce+Springsteen/Mansion+on+the+Hill';\">The mansion on the hill\n" +
                "\n" +
                "At night my daddy'd take me and we'd ride\n" +
                "Through the <em>streets</em> of a town so silent and still\n" +
                "Park on a <em>back</em> road along the highway</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/30853283/The+Swell+Season/Low+Rising\">Low Rising</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Clark%20Gayton/79322\">Clark Gayton</a>, <a href=\"artist/Steven%20Bernstein/373893\">Steven Bernstein</a>, <a href=\"artist/Glen%20Hansard/432450\">Glen Hansard</a>, <a href=\"artist/Graham%20Hopkins/432555\">Graham Hopkins</a>, <a href=\"artist/Rob%20Bochnik/442196\">Rob Bochnik</a>, <a href=\"artist/Colm%20Mac%20Con%20Iomaire/450964\">Colm Mac Con Iomaire</a>, <a href=\"artist/Joseph%20Doyle/695770\">Joseph Doyle</a>, <a href=\"artist/Mark%C3%A9ta%20Irglov%C3%A1/867281\">Markéta Irglová</a>, <a href=\"artist/The%20Swell%20Season/1065568\">The Swell Season</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2970592\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2970592\">Strict Joy</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/The%20Swell%20Season/1065568\">The Swell Season</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2009</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/30853283/The+Swell+Season/Low+Rising';\">to meet me somewhere\n" +
                "Tonight in this old tourist town\n" +
                "And we'll go\n" +
                "\n" +
                "Low <em>rising</em>\n" +
                "'Cause we've gotta come <em>up</em>\n" +
                "We've gotta come <em>up</em>\n" +
                "Low <em>rising</em>\n" +
                "'Cause</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/24398329/Great+White/Eye+of+the+Tiger\">Eye of the Tiger</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Great%20White/4401\">Great White</a>, <a href=\"artist/Jack%20Russell/121098\">Jack Russell</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2266881\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2266881\">The Essential Great White</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Great%20White/4401\">Great White</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2011</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/24398329/Great+White/Eye+of+the+Tiger';\">Risin' <em>up</em>, <em>back</em> on the <em>street</em>\n" +
                "Did my time, took my chances\n" +
                "Went the distance now I'm <em>back</em> on my feet\n" +
                "Just a man and his will to survive\n" +
                "So many</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/153978/Wishbone+Ash/New+Rising+Star\">New Rising Star</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Wishbone%20Ash/52689\">Wishbone Ash</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/22124\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/22124\">Just Testing</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Wishbone%20Ash/52689\">Wishbone Ash</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1980</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/153978/Wishbone+Ash/New+Rising+Star';\">New <em>rising</em> star, sinister symphony\n" +
                "New <em>rising</em> sun shines on in sympathy\n" +
                "\n" +
                "You were a stranger in your homeland\n" +
                "Reborn on a spage-age <em>street</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/1677074/Gloria+Gaynor/Eye+of+the+Tiger\">Eye of the Tiger</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Gloria%20Gaynor/4345\">Gloria Gaynor</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/307896\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/307896\">Greatest Hits [Galaxy]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Gloria%20Gaynor/4345\">Gloria Gaynor</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1997</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/1677074/Gloria+Gaynor/Eye+of+the+Tiger';\">Risin' <em>up</em> <em>back</em> on the <em>street</em>\n" +
                "Did my time, took my chances\n" +
                "Went the distance now I'm <em>back</em> on my feet\n" +
                "Just a man and his will to survive\n" +
                "So many</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/6199579/Arena/Ascension\">Ascension</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Arena/37103\">Arena</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/635854\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/635854\">Contagion</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Arena/37103\">Arena</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2003</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/6199579/Arena/Ascension';\">beginning to this tale \n" +
                "<em>Rising</em> <em>up</em>\n" +
                "I see creation from the sky\n" +
                "I'm learning to fly\n" +
                "<em>Rising</em> <em>up</em>\n" +
                "I see creation from the sky\n" +
                "This freedom is mine</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/10546913/Various+Artists/Rising+Sun\">Rising Sun</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/The%20Living%20End/309994\">The Living End</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/1039960\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/1039960\">Standing on the Outside: The Songs of Cold Chisel</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Various%20Artists/0\">Various Artists</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2007</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/10546913/Various+Artists/Rising+Sun';\"><em>up</em>\n" +
                "She checked her bags\n" +
                "And then she broke my heart\n" +
                "Kissed my cheek\n" +
                "And told me not to keep in touch\n" +
                "\n" +
                "I said the <em>rising</em> sun just stole my girl</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/2593785/Emmylou+Harris/Mansion+on+the+Hill\">Mansion on the Hill</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Emmylou%20Harris/1642\">Emmylou Harris</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/92558\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/92558\">At the Ryman</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Emmylou%20Harris/1642\">Emmylou Harris</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1992</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/2593785/Emmylou+Harris/Mansion+on+the+Hill';\">That mansion on the hill \n" +
                "\n" +
                "At night my daddy take me and we'd ride \n" +
                "Through the <em>streets</em> of a town so silent and still \n" +
                "Park on a <em>back</em> road along</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/33936651/Emmylou+Harris/Mansion+on+the+Hill\">Mansion on the Hill</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Emmylou%20Harris%20%26%20the%20Nash%20Ramblers/196703\">Emmylou Harris & the Nash Ramblers</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3481637\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3481637\">At the Ryman [LP]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Emmylou%20Harris/1642\">Emmylou Harris</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1992</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/33936651/Emmylou+Harris/Mansion+on+the+Hill';\">That mansion on the hill \n" +
                "\n" +
                "At night my daddy take me and we'd ride \n" +
                "Through the <em>streets</em> of a town so silent and still \n" +
                "Park on a <em>back</em> road along</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/16803069/Cat+Stevens/Everytime+I+Dream\">Everytime I Dream</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Yusuf/169081\">Yusuf</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/1512041\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/1512041\">Roadsinger</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Cat%20Stevens/5528\">Cat Stevens</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2009</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/16803069/Cat+Stevens/Everytime+I+Dream';\">of nights that I see you again,\n" +
                "As I close my eyes like rims and curtains, slowly <em>rising</em> on an empty stage,\n" +
                "Then I'm <em>back</em> in the stall sitting all alone</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/19801574/Cat+Stevens/Everytime+I+Dream\">Everytime I Dream</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Yusuf/169081\">Yusuf</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/1837186\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/1837186\">Roadsinger [Bonus Track]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Cat%20Stevens/5528\">Cat Stevens</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2009</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/19801574/Cat+Stevens/Everytime+I+Dream';\">I see you again\n" +
                "As I close my eyes like rims and curtains slowly <em>rising</em> on an empty stage\n" +
                "Then I'm <em>back</em> in the stall sitting all alone waiting for</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/32779923/Bruce+Springsteen/Rising\">Rising</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3332017\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3332017\">The Essential Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2003</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/32779923/Bruce+Springsteen/Rising';\">Come on <em>up</em> for the <em>rising</em>\n" +
                "Come on <em>up</em>, lay your hands in mine\n" +
                "Come on <em>up</em> for the <em>rising</em>\n" +
                "Come on <em>up</em> for the <em>rising</em> tonight\n" +
                "\n" +
                "Left the house this</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/23366118/Cat+Stevens/Everytime+I+Dream\">Everytime I Dream</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Yusuf/169081\">Yusuf</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2143424\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2143424\">Icon</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Cat%20Stevens/5528\">Cat Stevens</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2011</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/23366118/Cat+Stevens/Everytime+I+Dream';\">I see you again\n" +
                "As I close my eyes like rims and curtains slowly <em>rising</em> on an empty stage\n" +
                "Then I'm <em>back</em> in the stall sitting all alone waiting for</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/5613756/Bruce+Springsteen/The+Rising\">The Rising</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/597740\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/597740\">The Rising</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Bruce%20Springsteen/5505\">Bruce Springsteen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2002</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/5613756/Bruce+Springsteen/The+Rising';\">Come on <em>up</em> for the <em>rising</em>\n" +
                "Come on <em>up</em>, lay your hands in mine\n" +
                "Come on <em>up</em> for the <em>rising</em>\n" +
                "Come on <em>up</em> for the <em>rising</em> tonight\n" +
                "\n" +
                "Left the house this</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/26473/Cold+Chisel/Rising+Sun\">Rising Sun</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Cold%20Chisel/16572\">Cold Chisel</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/33641\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/33641\">East</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Cold%20Chisel/16572\">Cold Chisel</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1980</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/26473/Cold+Chisel/Rising+Sun';\">away\n" +
                "The <em>Rising</em> Sun just stole my girl away\n" +
                "The <em>Rising</em> Sun just stole my girl\n" +
                "I'm gonna catch a plane and steal her <em>back</em> again\n" +
                "The <em>Rising</em> Sun just</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t<div class=\"tdata-ext\">\n" +
                "\t\t\t\t\t\t<div class=\"hidden-xs\">\n" +
                "\t\t\t\t\t\t\t<div class=\"pager\"><a href=\"/lyrics/rising%20back%20up%20on%20the%20street\" class=\"rc5 s\">1</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=2\" class=\"rc5\">2</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=3\" class=\"rc5\">3</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=4\" class=\"rc5\">4</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=5\" class=\"rc5\">5</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=6\" class=\"rc5\">6</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=7\" class=\"rc5\">7</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=8\" class=\"rc5\">8</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=9\" class=\"rc5\">9</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=10\" class=\"rc5\">10</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=11\" class=\"arr\">&raquo;</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=669\" class=\"rc5\">669</a></div>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class=\"hidden-sm hidden-md hidden-lg\">\n" +
                "\t\t\t\t\t\t\t<div class=\"pager\"><a href=\"/lyrics/rising%20back%20up%20on%20the%20street\" class=\"rc5 s\">1</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=2\" class=\"rc5\">2</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=3\" class=\"rc5\">3</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=4\" class=\"rc5\">4</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=5\" class=\"rc5\">5</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=6\" class=\"arr\">&raquo;</a><a href=\"serp.php?st=rising+back+up+on+the+street&p=669\" class=\"rc5\">669</a></div>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t<section class=\"callout\">\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<h4>Discuss these <a href=\"https://www.lyrics.com/lyrics/rising%20back%20up%20on%20the%20street\">rising back up on the street Lyrics</a> with the community:</h4>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\t\t\t\t\t\t<div class=\"fb-comments-unloaded\" data-href=\"http://www.lyrics.com/lyrics/rising%20back%20up%20on%20the%20street\" data-numposts=\"5\" data-colorscheme=\"light\" data-order-by=\"reverse_time\"></div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t</section>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<div class=\"callout clearfix row\">\n" +
                "\t<div>\n" +
                "\t\t<div class=\"callout-int\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t\t\t<hgroup>\n" +
                "\t\t\t\t\t\t<h1>We need you!</h1>\n" +
                "\t\t\t\t\t\t<h3>Help build the largest human-edited lyrics collection on the web!</h3>\n" +
                "\t\t\t\t\t</hgroup>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t\t\t<div class=\"actions\"><button type=\"button\" class=\"btn primary lrg\" onclick=\"location.href='https://www.lyrics.com/addlyric.php';\">Add Lyrics</button></div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t</div>\n" +
                "\t\n" +
                "\t<div id=\"content-aside\" class=\"col-sm-4 col-sm-pull-8\">\n" +
                "\t\t<div class=\"hidden-xs\">\n" +
                "    <hr class=\"sep\">\n" +
                "<div class=\"tagline\">\n" +
                "\t<h2>The Web's Largest Resource for</h2>\n" +
                "\t<h1>Music, Songs <span>&amp;</span> Lyrics</h1>\n" +
                "</div>    <div class=\"nsep\"><hr><h3>A Member Of The <span>STANDS4 Network</span></h3></div>\n" +
                "    <div id=\"sb-social\">\n" +
                "\t<div class=\"clearfix\">\n" +
                "\t<div class=\"social\" title=\"Share this page on Facebook\"><a id=\"share-facebook\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"fb\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page on Twitter\"><a id=\"share-twitter\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"tw\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page on Google+\"><a id=\"share-googleplus\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"gp\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page with AddThis\"><a id=\"share-addthis\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"at\"></div></a></div>\n" +
                "\t</div>\n" +
                "</div>    <hr class=\"sep\">\n" +
                "</div>\t\t\n" +
                "\t\t\t\t\t<script>\n" +
                "/* Lyrics.net - MedRec *//*\n" + -----> Where we separated the two chunks
                "cf_page_artist = \"\";\n" +
                "cf_page_song = \"\";\n" +
                "cf_adunit_id = \"39381629\";\n" +
                "</script>\n" +
                "<script src=\"//srv.clickfuse.com/showads/showad.js\"></script>\t\t\t\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_A -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_A'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_A'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_B -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_B'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_B'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_C -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_C'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_C'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_D -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_D'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_D'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "\t\t\t</div>\n" +
                "\t\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<footer id=\"footer\">\n" +
                "\t<div id=\"footer-int\" class=\"clearfix container-fluid\">\n" +
                "\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-3\">\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-5\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Company</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"https://www.lyrics.com/\">Home</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"about.php?slc=Lyrics\">About</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"news.php\">News</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"press.php\">Press</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"awards.php\">Awards</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"testimonials.php\">Testimonials</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-7\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Editorial</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"login.php\">Login</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"addlyric.php\">Add new Lyrics</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"signup.php\">Become an Editor</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"editors.php\">Meet the Editors</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"justadded.php\">Recently Added</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"activity.php\">Activity Log</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"https://www.lyrics.com/toplyrics.php\">Most Popular</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Services</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"http://www.abbreviations.com/tools.php\">Tools</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"playlist.php\">Your Playlist</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"invite.php\">Tell a Friend</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a id=\"page-bookmark\" href=\"\">Bookmark Us</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"lyrics_api.php\">Lyrics API</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t\t<ul class=\"last\">\n" +
                "\t\t\t\t\t\t\t<h5>Legal &amp; Contact</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"terms.php\">Terms of Use</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"privacy.php\">Privacy Policy</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"contact.php\">Contact Us</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"advertise.php\">Advertise</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\n" +
                "<div id=\"s4-network\" class=\"col-xs-12 col-sm-5\">\n" +
                "\t<div  class=\"row\">\n" +
                "\t\t<h5 class=\"col-xs-12 col-sm-12\">The STANDS4 Network</h5>\n" +
                "\t</div>\n" +
                "\n" +
                "\t<!-- Desktop version -->\n" +
                "\t<div class=\"clearfix row hidden-xs\">\n" +
                "\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-abbreviations\"><a rel=\"nofollow\" href=\"http://www.abbreviations.com/\">Abbreviations</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-convert\"><a rel=\"nofollow\" href=\"http://www.convert.net/\">Conversions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-lyrics\"><a rel=\"nofollow\" href=\"http://www.lyrics.com/\">Lyrics</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-poetry\"><a rel=\"nofollow\" href=\"http://www.poetry.net/\">Poetry</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-rhymes\"><a rel=\"nofollow\" href=\"http://www.rhymes.net/\">Rhymes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-synonyms\"><a rel=\"nofollow\" href=\"http://www.synonyms.net/\">Synonyms</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-acronyms\"><a rel=\"nofollow\" href=\"http://www.acronyms.com/\">Acronyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-definitions\"><a rel=\"nofollow\" href=\"http://www.definitions.net/\">Definitions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-math\"><a rel=\"nofollow\" href=\"http://www.math.net/\">Math</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-quotes\"><a rel=\"nofollow\" href=\"http://www.quotes.net/\">Quotes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-scripts\"><a rel=\"nofollow\" href=\"http://www.scripts.com/\">Scripts</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-ua\"><a rel=\"nofollow\" href=\"http://www.useragents.com/\">User Agents</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t<ul class=\"last\">\n" +
                "\t\t\t\t<li class=\"nw-biographies\"><a rel=\"nofollow\" href=\"http://www.biographies.net/\">Biographies</a></li>\n" +
                "\t\t\t\t<li class=\"nw-grammar\"><a rel=\"nofollow\" href=\"http://www.grammar.com/\">Grammar</a></li>\n" +
                "\t\t\t\t<li class=\"nw-phrases\"><a rel=\"nofollow\" href=\"http://www.phrases.net/\">Phrases</a></li>\n" +
                "\t\t\t\t<li class=\"nw-references\"><a rel=\"nofollow\" href=\"http://www.references.net/\">References</a></li>\n" +
                "\t\t\t\t<li class=\"nw-symbols\"><a rel=\"nofollow\" href=\"http://www.symbols.com/\">Symbols</a></li>\n" +
                "\t\t\t\t<li class=\"nw-uszip\"><a rel=\"nofollow\" href=\"http://www.uszip.com/\">Zip Codes</a></li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t</div>\n" +
                "\n" +
                "\t<!-- Mobile version -->\n" +
                "\t<div class=\"clearfix row hidden-sm hidden-md hidden-lg\">\n" +
                "\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-abbreviations\"><a rel=\"nofollow\" href=\"http://www.abbreviations.com/\">Abbreviations</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-acronyms\"><a rel=\"nofollow\" href=\"http://www.acronyms.com/\">Acronyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-biographies\"><a rel=\"nofollow\" href=\"http://www.biographies.net/\">Biographies</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-convert\"><a rel=\"nofollow\" href=\"http://www.convert.net/\">Conversions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-definitions\"><a rel=\"nofollow\" href=\"http://www.definitions.net/\">Definitions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-grammar\"><a rel=\"nofollow\" href=\"http://www.grammar.com/\">Grammar</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-lyrics\"><a rel=\"nofollow\" href=\"http://www.lyrics.com/\">Lyrics</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-math\"><a rel=\"nofollow\" href=\"http://www.math.net/\">Math</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-phrases\"><a rel=\"nofollow\" href=\"http://www.phrases.net/\">Phrases</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-poetry\"><a rel=\"nofollow\" href=\"http://www.poetry.net/\">Poetry</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-quotes\"><a rel=\"nofollow\" href=\"http://www.quotes.net/\">Quotes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-references\"><a rel=\"nofollow\" href=\"http://www.references.net/\">References</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-rhymes\"><a rel=\"nofollow\" href=\"http://www.rhymes.net/\">Rhymes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-scripts\"><a rel=\"nofollow\" href=\"http://www.scripts.com/\">Scripts</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-symbols\"><a rel=\"nofollow\" href=\"http://www.symbols.com/\">Symbols</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-synonyms\"><a rel=\"nofollow\" href=\"http://www.synonyms.net/\">Synonyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-ua\"><a rel=\"nofollow\" href=\"http://www.useragents.com/\">User Agents</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-uszip\"><a rel=\"nofollow\" href=\"http://www.uszip.com/\">Zip Codes</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\n" +
                "\t<div class=\"clearfix\">\n" +
                "\t\t<div class=\"copyright\"><strong>&copy; 2001-2017 STANDS4 LLC.</strong><br>All rights reserved.</div>\n" +
                "\t\t<div id=\"social-icons\">\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"http://www.facebook.com/STANDS4\" target=\"_blank\"><div class=\"social fb\"></div></a>\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"http://twitter.com/justadded\" target=\"_blank\"><div class=\"social tw\"></div></a>\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"https://plus.google.com/+abbreviations/\" rel=\"publisher\" target=\"_blank\"><div class=\"social gp\"></div></a>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t</div>\n" +
                "</footer>\n" +
                "\n" +
                "</div>\n" +
                "<!--[if gt IE 8]>-->\n" +
                "<script src=\"root/app_common/js/libs/modernizr-2.8.3.custom.min.js\"></script>\n" +
                "<!--<![endif]-->\n" +
                "\n" +
                "<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>\n" +
                "<script>window.jQuery || document.write('<script src=\"root/app_common/js/libs/jquery-1.11.2.min.js\"><\\/script>')</script>\n" +
                "\n" +
                "<script src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js\"></script>\n" +
                "<script>window.jQuery || document.write('<script src=\"root/app_common/js/libs/jquery-ui-1.11.3.custom.min.js\"><\\/script>')</script>\n" +
                "\n" +
                "<script src=\"root/app_common/js/libs/jquery.placeholder.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/wselect.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/bootstrap-3.3.2.min.js\"></script>\n" +
                "\n" +
                "<script src=\"https://use.fontawesome.com/1d5fda5f00.js\"></script>\n" +
                "\n" +
                "<script src=\"js/lyrc.js\"></script>\n" +
                "<!-- /52304935/Lyrics_1x1_Slider -->\n" +
                "<div id='div-gpt-ad-Lyrics_1x1_Slider' style='height:1px; width:1px;'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_1x1_Slider'); });\n" +
                "</script>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n" +
                "<!-- Timer: 1.0525 secs | Server: 127.0.0.1 -->");*/

        HTMLReaderTest htmlReaderTest = new HTMLReaderTest("\n" +
                "\n" +
                "<!doctype html>\n" +
                "<!--[if lt IE 7]> <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if IE 7]>    <html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if IE 8]>    <html class=\"no-js lt-ie9\" lang=\"en\"> <![endif]-->\n" +
                "<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"en\"> <!--<![endif]--><head>\n" +
                "\n" +
                "<!-- DFP head code - START -->\n" +
                "<script>\n" +
                "var PREBID_TIMEOUT = 1000;\n" +
                "var MAX_RETRIES = 20;\n" +
                "var EXCHANGE_RATE = 3.5;\n" +
                "var pbjs = pbjs || {};\n" +
                "pbjs.que = pbjs.que || [];\n" +
                "\n" +
                "var googletag = googletag || {};\n" +
                "googletag.cmd = googletag.cmd || [];\n" +
                "\n" +
                "function detectWidth() {var w = window,d = document, e = d.documentElement, x = screen.width || e.offsetWidth || e.clientWidth;return x;}\n" +
                "var screenSizeMobile = 768;\n" +
                "function initHBS() {\n" +
                "  if (pbjs.initAdserverSet) return;\n" +
                "  loadScript('//www.googletagservices.com/tag/js/gpt.js');\n" +
                "  pbjs.initAdserverSet = true;\n" +
                "}\n" +
                "setTimeout(initHBS, PREBID_TIMEOUT);\n" +
                "\n" +
                "if (detectWidth() < screenSizeMobile) {\n" +
                "      googletag.cmd.push(function () {\n" +
                "         googletag.pubads().setTargeting(\"device\", \"mobile\");\n" +
                "      });\n" +
                "    loadScript('https://www.lyrics.com/adunits/prebid-mobile.js');\n" +
                "} else {\n" +
                "      googletag.cmd.push(function () {\n" +
                "         googletag.pubads().setTargeting(\"device\", \"desktop\");\n" +
                "      });\n" +
                "    loadScript('https://www.lyrics.com/adunits/prebid-desktop.js');\n" +
                "}\n" +
                "\n" +
                "function loadScript(scriptSrc) {\n" +
                "  var script = document.createElement('script');\n" +
                "  script.async=true;\n" +
                "  script.type = 'text/javascript';\n" +
                "  script.src = scriptSrc;\n" +
                "  var node = document.getElementsByTagName('script')[0];\n" +
                "  node.parentNode.insertBefore(script, node);\n" +
                "}\n" +
                "\n" +
                "pbjs.que.push(function() {\n" +
                "  pbjs.bidderSettings = {\n" +
                "    standard: {\n" +
                "      adserverTargeting: [{\n" +
                "        key: \"hb_bidder\",\n" +
                "        val: function(bidResponse) {\n" +
                "         return bidResponse.bidderCode;\n" +
                "       }\n" +
                "      }, {\n" +
                "        key: \"hb_adid\",\n" +
                "        val: function(bidResponse) {\n" +
                "         return bidResponse.adId;\n" +
                "       }\n" +
                "      }, {\n" +
                "        key: \"hb_pb\",\n" +
                "        val: function(bidResponse) {\n" +
                "         if(bidResponse.cpm >= 80) return '80.00';\n" +
                "         return (Math.floor(bidResponse.cpm * 4) / 4).toFixed(2);\n" +
                "       }\n" +
                "      }, {\n" +
                "         key: 'hb_size',\n" +
                "         val: function (bidResponse) {\n" +
                "            return bidResponse.size;\n" +
                "         }\n" +
                "      }]\n" +
                "    },\n" +
                "    sekindoA:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE * .75;\n" +
                "      }\n" +
                "    },\n" +
                "    aol:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    sovrn:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    sekindoUM:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    pulsepoint:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    districtmDMX:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    rhythmone:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    rubicon:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE  * .75;\n" +
                "      }\n" +
                "    },\n" +
                "    brealtime:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE * .85;\n" +
                "      }\n" +
                "    },\n" +
                "    indexExchange:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    },\n" +
                "    appnexus:{\n" +
                "      bidCpmAdjustment: function (bidCpm) {\n" +
                "        return bidCpm * EXCHANGE_RATE;\n" +
                "      }\n" +
                "    }\n" +
                "  };\n" +
                "});\n" +
                "</script>\n" +
                "\n" +
                "<script>\n" +
                "var mapSizeMRU = [[300, 250], [300, 600]];\n" +
                "if(detectWidth() < screenSizeMobile) mapSizeMRU = [[300, 250]];\n" +
                "\n" +
                "  googletag.cmd.push(function() {\n" +
                "    googletag.defineSlot('/52304935/Lyrics_IA_300x250_A', [300, 250], 'div-gpt-ad-Lyrics_IA_300x250_A').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_IA_300x250_B', [300, 250], 'div-gpt-ad-Lyrics_IA_300x250_B').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_A', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_A').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_B', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_B').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_C', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_C').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_300x250_D', mapSizeMRU, 'div-gpt-ad-Lyrics_LR_300x250_D').addService(googletag.pubads());\n" +
                "    googletag.defineSlot('/52304935/Lyrics_LR_125x125', [125, 125], 'div-gpt-ad-Lyrics_LR_125x125').addService(googletag.pubads());\n" +
                "\n" +
                "    googletag.defineSlot('/52304935/Lyrics_1x1_Slider', [1, 1], 'div-gpt-ad-Lyrics_1x1_Slider').addService(googletag.pubads());\n" +
                "    \n" +
                "    pbjs.que.push(function () {\n" +
                "      pbjs.setTargetingForGPTAsync();\n" +
                "    });\n" +
                "\n" +
                "    googletag.pubads().enableSingleRequest();\n" +
                "    googletag.pubads().collapseEmptyDivs();\n" +
                "    googletag.enableServices();\n" +
                "  });\n" +
                "\n" +
                "</script>\n" +
                "<!-- DFP head code - END --><meta charset=\"utf-8\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "<title>Lyrics containing the term: stop me now</title>\n" +
                "<meta name=\"description\" content=\"A list of lyrics, artists and songs that contain the term &quot;stop me now&quot; - from the Lyrics.com website.\">\n" +
                "<meta name=\"keywords\" content=\"stop me now lyrics, stop me now lyric, stop me now songs, stop me now artists, lyrics for stop me now\">\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width\">\n" +
                "<base href=\"https://www.lyrics.com/\">\n" +
                "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Droid+Sans:400,700|Droid+Serif:400,700,400italic,700italic|Droid+Sans+Mono|Yanone+Kaffeesatz:200,300,400,700|Goudy+Bookletter+1911|Lobster+Two:400,700,400italic,700italic|Original+Surfer|\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/bootstrap.min.css\">\n" +
                "<!--<link rel=\"stylesheet\" href=\"--><!--/app_common/css/normalize.css\">-->\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/smoothness/jquery-ui-1.11.3.custom.min.css\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/lyrc.css\">\n" +
                "<!--[if lt IE 9]> <link rel=\"stylesheet\" href=\"root/app_common/css/lyrc-ie8.css\"> <![endif]-->\n" +
                "<!--[if lt IE 8]> <link rel=\"stylesheet\" href=\"root/app_common/css/lyrc-ie7.css\"> <![endif]-->\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/helpers.css\">\n" +
                "<link rel=\"stylesheet\" href=\"root/app_common/css/media.css\">\n" +
                "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"root/app_common/img/favicon_lyrc.ico\">\n" +
                "<link rel=\"search\" type=\"application/opensearchdescription+xml\" title=\"Lyrics.com\" href=\"https://www.lyrics.com/open-search.xml\">\n" +
                "\n" +
                "<!--[if lt IE 9]>\n" +
                "<script src=\"root/app_common/js/libs/modernizr-2.8.3.custom.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/html5shiv.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/respond.min.js\"></script>\n" +
                "<![endif]--><script type=\"text/javascript\">\n" +
                "  var _gaq = _gaq || [];\n" +
                "  _gaq.push(['_setAccount', 'UA-172613-15']);\n" +
                "  _gaq.push(['_trackPageview']);\n" +
                "  (function() {\n" +
                "    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n" +
                "    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
                "    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n" +
                "  })();\n" +
                "</script><meta property=\"fb:app_id\" content=\"118234861672613\"/>\n" +
                "<meta name=\"google-signin-client_id\" content=\"567628204450-49mrbnlqde6k322k6j1nmpstf86djv24.apps.googleusercontent.com\">\n" +
                "\n" +
                "\t<meta property=\"og:url\" content=\"https://www.lyrics.com/lyrics/stop%20me%20now\" />\n" +
                "\t<link rel=\"canonical\" href=\"https://www.lyrics.com/lyrics/stop%20me%20now\" />\n" +
                "\n" +
                "</head>\n" +
                "<body id=\"s4-page-serp\" data-fb=\"118234861672613\" data-atp=\"ra-4f75bf3d5305fac2\">\n" +
                "<!--[if lt IE 7]><p class=chromeframe>Your browser is <em>ancient!</em> <a href=\"http://browsehappy.com/\">Upgrade to a different browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">install Google Chrome Frame</a> to experience this site.</p><![endif]-->\n" +
                "\n" +
                "<div id=\"fb-root\"></div>\n" +
                "<script>(function(d, s, id) {\n" +
                "  var js, fjs = d.getElementsByTagName(s)[0];\n" +
                "  if (d.getElementById(id)) return;\n" +
                "  js = d.createElement(s); js.id = id;\n" +
                "  js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=118234861672613&version=v2.3\";\n" +
                "  fjs.parentNode.insertBefore(js, fjs);\n" +
                "}(document, 'script', 'facebook-jssdk'));</script>\n" +
                "\n" +
                "<div id=\"page-container\">\n" +
                "<header id=\"header\">\n" +
                "\t<div id=\"header-int\" class=\"clearfix\">\t\t\n" +
                "\t\t\t\t\t<div id=\"user-login\"><a href=\"login.php\">Login</a></div>\n" +
                "\t\t\t\t<div id=\"network-header\"><span id=\"network-header-trigger\">The&nbsp;STANDS4&nbsp;Network<span class=\"arw\">&#9776;</span></span>\n" +
                "\t<ul id=\"network-header-links\" style=\"display:none;\">\n" +
                "\t\t<li class=\"nw-abbreviations\"><a href=\"http://www.abbreviations.com/\">ABBREVIATIONS</a></li>\n" +
                "\t\t<li class=\"nw-anagrams\"><a href=\"http://www.anagrams.net/\">ANAGRAMS</a></li>\n" +
                "\t\t<li class=\"nw-biographies\"><a href=\"http://www.biographies.net/\">BIOGRAPHIES</a></li>\n" +
                "\t\t<li class=\"nw-convert\"><a href=\"http://www.convert.net/\">CONVERSIONS</a></li>\n" +
                "\t\t<li class=\"nw-definitions\"><a href=\"http://www.definitions.net/\">DEFINITIONS</a></li>\n" +
                "\t\t<li class=\"nw-grammar\"><a href=\"http://www.grammar.com/\">GRAMMAR</a></li>\n" +
                "\t\t<li class=\"nw-lyrics\"><a href=\"http://www.lyrics.com/\">LYRICS</a></li>\n" +
                "\t\t<li class=\"nw-phrases\"><a href=\"http://www.phrases.net/\">PHRASES</a></li>\n" +
                "\t\t<li class=\"nw-poetry\"><a href=\"http://www.poetry.net/\">POETRY</a></li>\n" +
                "\t\t<li class=\"nw-quotes\"><a href=\"http://www.quotes.net/\">QUOTES</a></li>\n" +
                "\t\t<li class=\"nw-references\"><a href=\"http://www.references.net/\">REFERENCES</a></li>\n" +
                "\t\t<li class=\"nw-rhymes\"><a href=\"http://www.rhymes.net/\">RHYMES</a></li>\n" +
                "\t\t<li class=\"nw-scripts\"><a href=\"http://www.scripts.com/\">SCRIPTS</a></li>\n" +
                "\t\t<li class=\"nw-symbols\"><a href=\"http://www.symbols.com/\">SYMBOLS</a></li>\n" +
                "\t\t<li class=\"nw-synonyms\"><a href=\"http://www.synonyms.net/\">SYNONYMS</a></li>\n" +
                "\t\t<li class=\"nw-uszip\"><a href=\"http://www.uszip.com/\">USZIP</a></li>\n" +
                "\t</ul>\n" +
                "</div>\t</div>\n" +
                "</header><div id=\"main\" role=\"main\" class=\"container\">\n" +
                "<div id=\"content-top\" class=\"content-top\">\n" +
                "\t<div class=\"view-desktop hidden-xs\">\n" +
                "\t\t<form id=\"search-frm\" method=\"get\" action=\"subserp.php\">\n" +
                "<div id=\"page-top-search\" class=\"rc5\">\n" +
                "\t<div id=\"page-word-search\">\n" +
                "\t\t<input type=\"text\" id=\"page-word-search-query\" class=\"rc5\" name=\"st\" value=\"stop me now\" placeholder=\"Search for lyrics or artists...\" autocomplete=\"off\">\n" +
                "\t\t<div id=\"page-word-search-icon\"></div>\n" +
                "\t\t<button type=\"submit\" class=\"btn primary\" id=\"page-word-search-button\">Search</button>\n" +
                "\t</div>\n" +
                "\t<div id=\"page-word-search-ops\">\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op1\" value=\"1\" checked=\"checked\"><label for=\"page-word-search-op1\"><span>in Lyrics</span></label></div>\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op2\" value=\"2\"><label for=\"page-word-search-op2\"><span>in Artists</span></label></div>\n" +
                "\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-op3\" value=\"3\"><label for=\"page-word-search-op3\"><span>in Albums</span></label></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div id=\"page-letter-search\" class=\"rc5\"><a href=\"/artists/0\">#</a><a href=\"/artists/A\">A</a><a href=\"/artists/B\">B</a><a href=\"/artists/C\">C</a><a href=\"/artists/D\">D</a><a href=\"/artists/E\">E</a><a href=\"/artists/F\">F</a><a href=\"/artists/G\">G</a><a href=\"/artists/H\">H</a><a href=\"/artists/I\">I</a><a href=\"/artists/J\">J</a><a href=\"/artists/K\">K</a><a href=\"/artists/L\">L</a><a href=\"/artists/M\">M</a><a href=\"/artists/N\">N</a><a href=\"/artists/O\">O</a><a href=\"/artists/P\">P</a><a href=\"/artists/Q\">Q</a><a href=\"/artists/R\">R</a><a href=\"/artists/S\">S</a><a href=\"/artists/T\">T</a><a href=\"/artists/U\">U</a><a href=\"/artists/V\">V</a><a href=\"/artists/W\">W</a><a href=\"/artists/X\">X</a><a href=\"/artists/Y\">Y</a><a href=\"/artists/Z\">Z</a><span class=\"vbar\">&nbsp;</span><a href=\"justadded.php\" class=\"z\">NEW</a><a href=\"random.php\" class=\"z\">RANDOM</a></div>\n" +
                "</form>\t\t<div id=\"page-top-logo\" onclick=\"location.href='https://www.lyrics.com/';\"><img src=\"root/app_common/img/top_logo_lyr.png\" alt=\"Lyrics.com\" title=\"Lyrics.com\"></div>\n" +
                "\t</div>\n" +
                "\t<div class=\"view-mobile visible-xs\">\n" +
                "\t\t<form id=\"search-frm\" method=\"get\" action=\"subserp.php\">\n" +
                "\t<div id=\"page-top-search\" class=\"rc5\">\n" +
                "\t\t<div id=\"page-word-search\">\n" +
                "\t\t\t<input type=\"text\" id=\"page-word-search-query\" class=\"rc5\" name=\"st\" value=\"stop me now\" autocomplete=\"off\">\n" +
                "\t\t\t<div id=\"page-word-search-icon\"></div>\n" +
                "\t\t\t<button type=\"submit\" class=\"btn primary\" id=\"page-word-search-button\">Search</button>\n" +
                "\t\t</div>\n" +
                "\t\t<div id=\"page-word-search-ops\">\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op1\" value=\"1\" checked=\"checked\"><label for=\"page-word-search-m-op1\"><span>in Lyrics</span></label></div>\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op2\" value=\"2\"><label for=\"page-word-search-m-op2\"><span>in Artists</span></label></div>\n" +
                "\t\t\t<div><input type=\"radio\" class=\"custom-rb\" name=\"qtype\" id=\"page-word-search-m-op3\" value=\"3\"><label for=\"page-word-search-m-op3\"><span>in Albums</span></label></div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\t<div id=\"page-letter-search\" class=\"rc5\"><a href=\"/quotes/0\">#</a><a href=\"/quotes/A\">A</a><a href=\"/quotes/B\">B</a><a href=\"/quotes/C\">C</a><a href=\"/quotes/D\">D</a><a href=\"/quotes/E\">E</a><a href=\"/quotes/F\">F</a><a href=\"/quotes/G\">G</a><a href=\"/quotes/H\">H</a><a href=\"/quotes/I\">I</a><a href=\"/quotes/J\">J</a><a href=\"/quotes/K\">K</a><a href=\"/quotes/L\">L</a><a href=\"/quotes/M\">M</a><a href=\"/quotes/N\">N</a><a href=\"/quotes/O\">O</a><a href=\"/quotes/P\">P</a><a href=\"/quotes/Q\">Q</a><a href=\"/quotes/R\">R</a><a href=\"/quotes/S\">S</a><a href=\"/quotes/T\">T</a><a href=\"/quotes/U\">U</a><a href=\"/quotes/V\">V</a><a href=\"/quotes/W\">W</a><a href=\"/quotes/X\">X</a><a href=\"/quotes/Y\">Y</a><a href=\"/quotes/Z\">Z</a><span class=\"vbar\">&nbsp;</span><a href=\"justadded.php\" class=\"z\">NEW</a><a href=\"random.php\" class=\"z\">RANDOM</a></div>\n" +
                "</form>\t\t<div id=\"page-top-logo\" onclick=\"location.href='https://www.lyrics.com/';\"><img src=\"root/app_common/img/top_logo_lyr.png\" alt=\"Lyrics.com\" title=\"Lyrics.com\"></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"row\">\n" +
                "\t\n" +
                "\t<div id=\"content-main\" class=\"col-sm-8 col-sm-push-4\">\n" +
                "\t\t\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-12\">\n" +
                "\t\t\t\t<div class=\"category-header clearfix\">\n" +
                "\t\t\t\t\t<div class=\"sub-category-header-icon hidden-xs\"><i class=\"fa fa-music fa-4x\"></i></div>\n" +
                "\t\t\t\t\t<hgroup>\n" +
                "\t\t\t\t\t\t<div style=\"position:relative;float:right;top:1px;right:1px\"><div class=\"fb-like\" data-href=\"\" data-width=\"\" data-height=\"\" data-colorscheme=\"light\" data-layout=\"button_count\" data-action=\"like\" data-show-faces=\"true\" data-send=\"false\"></div></div>\t\t\t\t\t\t<h3><a href=\"signup.php\">Lyrics.com&nbsp;&raquo;</a></h3>\n" +
                "\t\t\t\t\t\t<h2>Search results for 'stop me now'</h2>\n" +
                "\t\t\t\t\t\t<h4>Yee yee! We've found <strong>251,777</strong> lyrics, <strong>22</strong> artists, and <strong>100</strong> albums matching <strong>stop me now</strong>.</h4>\n" +
                "\t\t\t\t\t</hgroup>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<div id=\"content-body\" class=\"row\">\n" +
                "\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-12\">\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"adunit-middle adunit-middle-2col clearfix\">\n" +
                "\t\t\t\t\t\t<div class=\"hidden-xs col-xs-12 col-sm-6\"><!-- /52304935/Lyrics_IA_300x250_B -->\n" +
                "<div id='div-gpt-ad-Lyrics_IA_300x250_B'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_IA_300x250_B'); });\n" +
                "</script>\n" +
                "</div></div>\n" +
                "\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-6\"><!-- /52304935/Lyrics_IA_300x250_A -->\n" +
                "<div id='div-gpt-ad-Lyrics_IA_300x250_A'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_IA_300x250_A'); });\n" +
                "</script>\n" +
                "</div></div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<div>\n" +
                "\t\t\t\t\t\t\t<h3>Artists:</h3>\n" +
                "\t\t\t\t\t\t\t<p class=\"serp-flat-list\"><a href=\"artist/Now%2C%20Now%20Every%20Children/1033654\">Now, Now Every Children</a> &middot; <a href=\"artist/Now%2C%20Now/2316274\">Now, Now</a> &middot; <a href=\"artist/Bus%20Stop/10248\">Bus Stop</a> &middot; <a href=\"artist/Stop/14400\">Stop</a> &middot; <a href=\"artist/Truck%20Stop/21146\">Truck Stop</a> &middot; <a href=\"artist/London%20Bus%20Stop/365549\">London Bus Stop</a> &middot; <a href=\"artist/Stop%20It/581522\">Stop It</a> &middot; <a href=\"artist/Can%27t%20Stop/1052276\">Can't Stop</a> &middot; <a href=\"artist/Triple%20Full%20Stop/2486612\">Triple Full Stop</a> &middot; <a href=\"artist/How%20Now%20Brown%20Cow/88099\">How Now Brown Cow</a> &middot; <a href=\"sub_artist.php?name=The+Neo+Now\">The Neo Now</a> &ndash; <strong><a href=\"serp.php?st=stop+me+now&o=1&qtype=2\">and 12 other artists &raquo;</a></strong></p>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<div>\n" +
                "\t\t\t\t\t\t\t<h3>Albums:</h3>\n" +
                "\t\t\t\t\t\t\t<p class=\"serp-flat-list\"><a href=\"/album/2107801\">Bus Stop/Stop! Stop! Stop!</a> (The Hollies) &middot; <a href=\"/album/1015615\">Stop Stop Stop</a> (V.I.A. Gra) &middot; <a href=\"/album/712321\">Stop! Stop! Stop!</a> (Via Gra) &middot; <a href=\"/album/9429\">Stop! Stop! Stop!</a> (The Hollies) &middot; <a href=\"/album/855853\">Stop the Tape Stop the Tape</a> (David & the Citizens) &middot; <a href=\"/album/815709\">Stop Snitchin', Stop Lyin'</a> (Game) &middot; <a href=\"/album/1387921\">Don't Stop! Don't Stop!</a> (The Fugs) &middot; <a href=\"/album/1204381\">Stop! Snyato! (Stop! That's a Wrap!)</a> (Via Gra) &middot; <a href=\"/album/1392890\">Can't Stop Won't Stop</a> (The Maine) &middot; <a href=\"/album/651029\">What the World Needs Now Is...Love: Non-Stop Love Hits</a> (Hutchinson, Hutch) &ndash; <strong><a href=\"serp.php?st=stop+me+now&o=1&qtype=3\">and 90 other albums &raquo;</a></strong></p>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/1015855/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29\">Piggy (Nothing Can Stop Me Now)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/198574\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/198574\">The Downward Spiral</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1994</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/1015855/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29';\">little piggy needed something new \n" +
                "\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I don't care anymore \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I just don't care \n" +
                "Nothing</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/27287613/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29\">Piggy (Nothing Can Stop Me Now)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2531099\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2531099\">Further Down the Spiral</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1995</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/27287613/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29';\">little piggy needed something new \n" +
                "\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I don't care anymore \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I just don't care \n" +
                "Nothing</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/5274210/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29\">Piggy (Nothing Can Stop Me Now)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/563651\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/563651\">And All That Could Have Been</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2002</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/5274210/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29';\">little piggy needed something new \n" +
                "\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I don't care anymore \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "'Cause I just don't care \n" +
                "Nothing</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/32599434/Nine+Inch+Nails/Piggy\">Piggy</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3299148\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3299148\">We Prick You</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2016</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/32599434/Nine+Inch+Nails/Piggy';\">piggy needed something new\n" +
                "\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "'Cause I don't care anymore \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "'Cause I don't care\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/32209300/Collective+Soul/Life\">Life</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Collective%20Soul/43292\">Collective Soul</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3261788\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3261788\">See What You Started by Continuing</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Collective%20Soul/43292\">Collective Soul</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2015</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/32209300/Collective+Soul/Life';\">can’t <em>stop</em> <em>me</em> <em>now</em>\n" +
                "You won’t <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Who could <em>stop</em> <em>me</em> <em>now</em>\n" +
                "It’s all inside\n" +
                "And well defined\n" +
                "As life\n" +
                "\n" +
                "Pride leads the course of you\n" +
                "Meant to strike our</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/9885441/Blur/Music+Is+My+Radar\">Music Is My Radar</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Blur/12405\">Blur</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/875475\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/875475\">Music Is My Radar</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Blur/12405\">Blur</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2000</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/9885441/Blur/Music+Is+My+Radar';\">y'all\n" +
                "Dealing I'll be seeing you\n" +
                "Really got my beats <em>now</em>, on my ear <em>now</em>...\n" +
                "\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/26819997/Queen/It%27s+a+Beautiful+Day+%28Reprise%29\">It's a Beautiful Day (Reprise)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Queen/5205\">Queen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2466106\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2466106\">40, Vol. 3</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Queen/5205\">Queen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2012</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/26819997/Queen/It%27s+a+Beautiful+Day+%28Reprise%29';\">It's a beautiful day\n" +
                "The sun is shining\n" +
                "I feel good\n" +
                "And no-one's gonna to <em>stop</em> <em>me</em> <em>now</em>, oh yeah.\n" +
                "\n" +
                "It's a beautiful day\n" +
                "I feel good, I feel right</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/8812408/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29+%5BDVD%5D\">Can't Do a Thing (To Stop Me) [DVD]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/833313\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/833313\">Best of Chris Isaak [CD/DVD]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2006</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/8812408/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29+%5BDVD%5D';\">Here I go again\n" +
                "Dreaming\n" +
                "Here I go again\n" +
                "\n" +
                "(can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "(can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "\n" +
                "Having a good time baby\n" +
                "Wish</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/2737470/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29\">Can't Do a Thing (To Stop Me)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/169871\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/169871\">San Francisco Days</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1993</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/2737470/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29';\">Here I go again\n" +
                "Dreaming\n" +
                "Here I go again\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "\n" +
                "Having a good time baby\n" +
                "Wish you</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/3967795/Foreigner/Ready+or+Not\">Ready or Not</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Foreigner/4296\">Foreigner</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/491444\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/491444\">Jukebox Heroes: The Foreigner Anthology</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Foreigner/4296\">Foreigner</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2000</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/3967795/Foreigner/Ready+or+Not';\">head\n" +
                "I know I going to ride tonight\n" +
                "\n" +
                "You look at <em>me</em>\n" +
                "But all I want to see\n" +
                "Is you tonight\n" +
                "\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Just</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/33932871/The+Temptations/Message+From+a+Black+Man\">Message From a Black Man</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/The%20Temptations/5616\">The Temptations</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3489735\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3489735\">Emperors of Soul</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/The%20Temptations/5616\">The Temptations</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1994</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/33932871/The+Temptations/Message+From+a+Black+Man';\">you try, you can't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "No matter how hard you try, you can't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "\n" +
                "Yes, your skin is white\n" +
                "Does that make you right?\n" +
                "\n" +
                "Why don't you</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/6441046/Fila+Brazillia/Music+Is+My+Radar\">Music Is My Radar</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Blur/12405\">Blur</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/649054\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/649054\">AnotherLateNight</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Fila%20Brazillia/170308\">Fila Brazillia</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2001</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/6441046/Fila+Brazillia/Music+Is+My+Radar';\">y'all\n" +
                "Dealing I'll be seeing you\n" +
                "Really got my beats <em>now</em>, on my ear <em>now</em>...\n" +
                "\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah don't <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Aah</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/28377664/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29\">Can't Do a Thing (To Stop Me)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/2342007\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/2342007\">Greatest Hits: Live [DVD]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2009</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/28377664/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29';\">Here I go again\n" +
                "Dreaming\n" +
                "Here I go again\n" +
                "\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "\n" +
                "Having a good time baby\n" +
                "Wish</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/9862384/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29\">Can't Do a Thing (To Stop Me)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/183072\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/183072\">Can't Do a Thing (To Stop Me)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Chris%20Isaak/4561\">Chris Isaak</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1993</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/9862384/Chris+Isaak/Can%27t+Do+a+Thing+%28To+Stop+Me%29';\">Here I go again\n" +
                "Dreaming\n" +
                "Here I go again\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "(Can't do a thing to <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "\n" +
                "Having a good time baby\n" +
                "Wish you</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/5850778/Queen/It%27s+a+Beautiful+Day\">It's a Beautiful Day</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Queen/5205\">Queen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/334657\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/334657\">Heaven for Everyone</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Queen/5205\">Queen</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1995</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/5850778/Queen/It%27s+a+Beautiful+Day';\">It's a beautiful day\n" +
                "The sun is shining\n" +
                "I feel good\n" +
                "And no-one's gonna <em>stop</em> <em>me</em> <em>now</em>, oh yeah\n" +
                "\n" +
                "It's a beautiful day\n" +
                "I feel good, I feel right</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/7184360/Sammy+Hagar/Don%27t+Stop+Me+Now\">Don't Stop Me Now</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Sammy%20Hagar/4423\">Sammy Hagar</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/708591\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/708591\">Musical Chairs</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Sammy%20Hagar/4423\">Sammy Hagar</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1977</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/7184360/Sammy+Hagar/Don%27t+Stop+Me+Now';\">Don't <em>stop</em> <em>me</em> <em>now</em>, I can't take it. \n" +
                "I can't quit, I don't know how, I can't fake it. \n" +
                "And who says it's not allowed? We can make it baby. \n" +
                "Don't</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/847907/Samantha+Fox/Nothing%27s+Gonna+Stop+Me+Now\">Nothing's Gonna Stop Me Now</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/7691\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/7691\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1987</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/847907/Samantha+Fox/Nothing%27s+Gonna+Stop+Me+Now';\">Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "\n" +
                "There was a time I couldn't get you out of my mind\n" +
                "And since the day you came you tried</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/1552141/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29\">Piggy (Nothing Can Stop Me Now)</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/315477\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/315477\">Further Down the Spiral</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1995</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/1552141/Nine+Inch+Nails/Piggy+%28Nothing+Can+Stop+Me+Now%29';\">little piggy needed something new \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "I don't care anymore \n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em> \n" +
                "I just don't care \n" +
                "Hey pig \n" +
                "Nothing's</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/33015296/Samantha+Fox/Nothing%27s+Gonna+Stop+Me+Now\">Nothing's Gonna Stop Me Now</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/3361658\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/3361658\">Greatest Hits [Jive]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1992</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/33015296/Samantha+Fox/Nothing%27s+Gonna+Stop+Me+Now';\">Nothing's gonna <em>stop</em> <em>me</em> <em>now</em> \n" +
                "Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>. \n" +
                "\n" +
                "There was a time I couldn't get you out of my mind \n" +
                "And since the day you came you</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/3026308/Nine+Inch+Nails/La+Mer\">La Mer</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/431157\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/431157\">The Fragile</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Nine%20Inch%20Nails/5033\">Nine Inch Nails</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1999</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/3026308/Nine+Inch+Nails/La+Mer';\"><em>stop</em> <em>me</em> <em>now</em></pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/15206511/G%C3%BCnther/Touch+Me\">Touch Me</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a>, <a href=\"artist/G%C3%BCnther/770083\">Günther</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/1462007\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/1462007\">Pleasureman [Sweden]</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/G%C3%BCnther/770083\">Günther</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2006</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/15206511/G%C3%BCnther/Touch+Me';\">Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>.\n" +
                "\n" +
                "There was a time I couldn't get you out of my mind\n" +
                "And since the day you came you tried</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/8637449/Stock%2C+Aitken+%26+Waterman/Nothing%27s+Gonna+Stop+Me+Now\">Nothing's Gonna Stop Me Now</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/815258\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/815258\">Gold</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Stock%2C%20Aitken%20%26%20Waterman/128854\">Stock, Aitken & Waterman</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2005</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/8637449/Stock%2C+Aitken+%26+Waterman/Nothing%27s+Gonna+Stop+Me+Now';\">Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "\n" +
                "There was a time I couldn't get you out of my mind\n" +
                "And since the day you came you tried</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/1873469/Various+Artists/Touch+Me\">Touch Me</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Samantha%20Fox/4301\">Samantha Fox</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/295608\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/295608\">Megadance Into the 90's</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Various%20Artists/0\">Various Artists</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1994</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/1873469/Various+Artists/Touch+Me';\">Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing's gonna <em>stop</em> <em>me</em> <em>now</em>.\n" +
                "\n" +
                "There was a time I couldn't get you out of my mind\n" +
                "And since the day you came you tried</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/17584603/Pitbull/Can%27t+Stop+Me+Now\">Can't Stop Me Now</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Pitbull/542550\">Pitbull</a>, <a href=\"artist/The%20New%20Royales/1178229\">The New Royales</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/1627664\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/1627664\">Pitbull Starring in Rebelution</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Pitbull/542550\">Pitbull</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">2009</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/17584603/Pitbull/Can%27t+Stop+Me+Now';\">Give it to <em>me</em>!\n" +
                "\n" +
                "Tell people that you sing on the radio \n" +
                "Same people you don't see on the radio (can't <em>stop</em> <em>me</em> <em>now</em>)\n" +
                "Tell people that you sing</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"sec-lyric clearfix\">\n" +
                "\t\t\t\t\t\t\t<div class=\"lyric-meta\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-title\"><a href=\"/lyric/2760323/Lou+Gramm/Ready+or+Not\">Ready or Not</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-artists\"><a href=\"artist/Lou%20Gramm/4391\">Lou Gramm</a></p>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"album-thumb\"><a href=\"/album/8480\"><img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7\"></a></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album\"><a href=\"/album/8480\">Ready or Not</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-artist\"><a href=\"artist/Lou%20Gramm/4391\">Lou Gramm</a></p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"lyric-meta-album-year\">1987</p>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t<pre class=\"lyric-body\" onclick=\"location.href='https://www.lyrics.com//lyric/2760323/Lou+Gramm/Ready+or+Not';\">You know I'm gonna ride tonight\n" +
                "You look at <em>me</em>\n" +
                "But all I want to see\n" +
                "Is you tonight\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Nothing can <em>stop</em> <em>me</em> <em>now</em>\n" +
                "Just</pre>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t<div class=\"tdata-ext\">\n" +
                "\t\t\t\t\t\t<div class=\"hidden-xs\">\n" +
                "\t\t\t\t\t\t\t<div class=\"pager\"><a href=\"/lyrics/stop%20me%20now\" class=\"rc5 s\">1</a><a href=\"serp.php?st=stop+me+now&p=2\" class=\"rc5\">2</a><a href=\"serp.php?st=stop+me+now&p=3\" class=\"rc5\">3</a><a href=\"serp.php?st=stop+me+now&p=4\" class=\"rc5\">4</a><a href=\"serp.php?st=stop+me+now&p=5\" class=\"rc5\">5</a><a href=\"serp.php?st=stop+me+now&p=6\" class=\"rc5\">6</a><a href=\"serp.php?st=stop+me+now&p=7\" class=\"rc5\">7</a><a href=\"serp.php?st=stop+me+now&p=8\" class=\"rc5\">8</a><a href=\"serp.php?st=stop+me+now&p=9\" class=\"rc5\">9</a><a href=\"serp.php?st=stop+me+now&p=10\" class=\"rc5\">10</a><a href=\"serp.php?st=stop+me+now&p=11\" class=\"arr\">&raquo;</a><a href=\"serp.php?st=stop+me+now&p=10072\" class=\"rc5\">10072</a></div>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class=\"hidden-sm hidden-md hidden-lg\">\n" +
                "\t\t\t\t\t\t\t<div class=\"pager\"><a href=\"/lyrics/stop%20me%20now\" class=\"rc5 s\">1</a><a href=\"serp.php?st=stop+me+now&p=2\" class=\"rc5\">2</a><a href=\"serp.php?st=stop+me+now&p=3\" class=\"rc5\">3</a><a href=\"serp.php?st=stop+me+now&p=4\" class=\"rc5\">4</a><a href=\"serp.php?st=stop+me+now&p=5\" class=\"rc5\">5</a><a href=\"serp.php?st=stop+me+now&p=6\" class=\"arr\">&raquo;</a><a href=\"serp.php?st=stop+me+now&p=10072\" class=\"rc5\">10072</a></div>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t<section class=\"callout\">\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t<h4>Discuss these <a href=\"https://www.lyrics.com/lyrics/stop%20me%20now\">stop me now Lyrics</a> with the community:</h4>\n" +
                "\t\t\t\t\t\t<hr>\n" +
                "\t\t\t\t\t\t<div class=\"fb-comments-unloaded\" data-href=\"http://www.lyrics.com/lyrics/stop%20me%20now\" data-numposts=\"5\" data-colorscheme=\"light\" data-order-by=\"reverse_time\"></div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t</section>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t<div class=\"callout clearfix row\">\n" +
                "\t<div>\n" +
                "\t\t<div class=\"callout-int\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t\t\t<hgroup>\n" +
                "\t\t\t\t\t\t<h1>We need you!</h1>\n" +
                "\t\t\t\t\t\t<h3>Help build the largest human-edited lyrics collection on the web!</h3>\n" +
                "\t\t\t\t\t</hgroup>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t\t\t<div class=\"actions\"><button type=\"button\" class=\"btn primary lrg\" onclick=\"location.href='https://www.lyrics.com/addlyric.php';\">Add Lyrics</button></div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t</div>\n" +
                "\t\n" +
                "\t<div id=\"content-aside\" class=\"col-sm-4 col-sm-pull-8\">\n" +
                "\t\t<div class=\"hidden-xs\">\n" +
                "    <hr class=\"sep\">\n" +
                "<div class=\"tagline\">\n" +
                "\t<h2>The Web's Largest Resource for</h2>\n" +
                "\t<h1>Music, Songs <span>&amp;</span> Lyrics</h1>\n" +
                "</div>    <div class=\"nsep\"><hr><h3>A Member Of The <span>STANDS4 Network</span></h3></div>\n" +
                "    <div id=\"sb-social\">\n" +
                "\t<div class=\"clearfix\">\n" +
                "\t<div class=\"social\" title=\"Share this page on Facebook\"><a id=\"share-facebook\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"fb\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page on Twitter\"><a id=\"share-twitter\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"tw\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page on Google+\"><a id=\"share-googleplus\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"gp\"></div></a></div>\n" +
                "\t<div class=\"social\" title=\"Share this page with AddThis\"><a id=\"share-addthis\" href=\"javascript:void(0);\" target=\"_blank\"><div class=\"at\"></div></a></div>\n" +
                "\t</div>\n" +
                "</div>    <hr class=\"sep\">\n" +
                "</div>\t\t\n" +
                "\t\t\t\t\t<script>\n" +
                "/* Lyrics.net - MedRec */\n" +
                "cf_page_artist = \"\";\n" +
                "cf_page_song = \"\";\n" +
                "cf_adunit_id = \"39381629\";\n" +
                "</script>\n" +
                "<script src=\"//srv.clickfuse.com/showads/showad.js\"></script>\t\t\t\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_A -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_A'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_A'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_B -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_B'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_B'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_C -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_C'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_C'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "<section><!-- /52304935/Lyrics_LR_300x250_D -->\n" +
                "<div id='div-gpt-ad-Lyrics_LR_300x250_D'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_LR_300x250_D'); });\n" +
                "</script>\n" +
                "</div></section>\n" +
                "\t\t\t</div>\n" +
                "\t\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<footer id=\"footer\">\n" +
                "\t<div id=\"footer-int\" class=\"clearfix container-fluid\">\n" +
                "\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-3\">\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-5\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Company</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"https://www.lyrics.com/\">Home</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"about.php?slc=Lyrics\">About</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"news.php\">News</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"press.php\">Press</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"awards.php\">Awards</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"testimonials.php\">Testimonials</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-7\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Editorial</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"login.php\">Login</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"addlyric.php\">Add new Lyrics</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"signup.php\">Become an Editor</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"editors.php\">Meet the Editors</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"justadded.php\">Recently Added</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"activity.php\">Activity Log</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"https://www.lyrics.com/toplyrics.php\">Most Popular</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t<h5>Services</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"http://www.abbreviations.com/tools.php\">Tools</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"playlist.php\">Your Playlist</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"invite.php\">Tell a Friend</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a id=\"page-bookmark\" href=\"\">Bookmark Us</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"lyrics_api.php\">Lyrics API</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t\t<ul class=\"last\">\n" +
                "\t\t\t\t\t\t\t<h5>Legal &amp; Contact</h5>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"terms.php\">Terms of Use</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"privacy.php\">Privacy Policy</a></li>\n" +
                "\t\t\t\t\t\t\t<li><a href=\"contact.php\">Contact Us</a></li>\n" +
                "\t\t\t\t\t\t\t<li class=\"ex\"><a href=\"advertise.php\">Advertise</a></li>\n" +
                "\t\t\t\t\t\t</ul>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\n" +
                "<div id=\"s4-network\" class=\"col-xs-12 col-sm-5\">\n" +
                "\t<div  class=\"row\">\n" +
                "\t\t<h5 class=\"col-xs-12 col-sm-12\">The STANDS4 Network</h5>\n" +
                "\t</div>\n" +
                "\n" +
                "\t<!-- Desktop version -->\n" +
                "\t<div class=\"clearfix row hidden-xs\">\n" +
                "\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-abbreviations\"><a rel=\"nofollow\" href=\"http://www.abbreviations.com/\">Abbreviations</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-convert\"><a rel=\"nofollow\" href=\"http://www.convert.net/\">Conversions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-lyrics\"><a rel=\"nofollow\" href=\"http://www.lyrics.com/\">Lyrics</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-poetry\"><a rel=\"nofollow\" href=\"http://www.poetry.net/\">Poetry</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-rhymes\"><a rel=\"nofollow\" href=\"http://www.rhymes.net/\">Rhymes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-synonyms\"><a rel=\"nofollow\" href=\"http://www.synonyms.net/\">Synonyms</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-acronyms\"><a rel=\"nofollow\" href=\"http://www.acronyms.com/\">Acronyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-definitions\"><a rel=\"nofollow\" href=\"http://www.definitions.net/\">Definitions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-math\"><a rel=\"nofollow\" href=\"http://www.math.net/\">Math</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-quotes\"><a rel=\"nofollow\" href=\"http://www.quotes.net/\">Quotes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-scripts\"><a rel=\"nofollow\" href=\"http://www.scripts.com/\">Scripts</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-ua\"><a rel=\"nofollow\" href=\"http://www.useragents.com/\">User Agents</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t<div class=\"col-xs-12 col-sm-4\">\n" +
                "\t\t\t<ul class=\"last\">\n" +
                "\t\t\t\t<li class=\"nw-biographies\"><a rel=\"nofollow\" href=\"http://www.biographies.net/\">Biographies</a></li>\n" +
                "\t\t\t\t<li class=\"nw-grammar\"><a rel=\"nofollow\" href=\"http://www.grammar.com/\">Grammar</a></li>\n" +
                "\t\t\t\t<li class=\"nw-phrases\"><a rel=\"nofollow\" href=\"http://www.phrases.net/\">Phrases</a></li>\n" +
                "\t\t\t\t<li class=\"nw-references\"><a rel=\"nofollow\" href=\"http://www.references.net/\">References</a></li>\n" +
                "\t\t\t\t<li class=\"nw-symbols\"><a rel=\"nofollow\" href=\"http://www.symbols.com/\">Symbols</a></li>\n" +
                "\t\t\t\t<li class=\"nw-uszip\"><a rel=\"nofollow\" href=\"http://www.uszip.com/\">Zip Codes</a></li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t</div>\n" +
                "\n" +
                "\t<!-- Mobile version -->\n" +
                "\t<div class=\"clearfix row hidden-sm hidden-md hidden-lg\">\n" +
                "\t\t<div class=\"col-xs-12 col-sm-8\">\n" +
                "\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-abbreviations\"><a rel=\"nofollow\" href=\"http://www.abbreviations.com/\">Abbreviations</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-acronyms\"><a rel=\"nofollow\" href=\"http://www.acronyms.com/\">Acronyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-biographies\"><a rel=\"nofollow\" href=\"http://www.biographies.net/\">Biographies</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-convert\"><a rel=\"nofollow\" href=\"http://www.convert.net/\">Conversions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-definitions\"><a rel=\"nofollow\" href=\"http://www.definitions.net/\">Definitions</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-grammar\"><a rel=\"nofollow\" href=\"http://www.grammar.com/\">Grammar</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-lyrics\"><a rel=\"nofollow\" href=\"http://www.lyrics.com/\">Lyrics</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-math\"><a rel=\"nofollow\" href=\"http://www.math.net/\">Math</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-phrases\"><a rel=\"nofollow\" href=\"http://www.phrases.net/\">Phrases</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div class=\"col-xs-6 col-sm-6\">\n" +
                "\t\t\t\t\t<ul>\n" +
                "\t\t\t\t\t\t<li class=\"nw-poetry\"><a rel=\"nofollow\" href=\"http://www.poetry.net/\">Poetry</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-quotes\"><a rel=\"nofollow\" href=\"http://www.quotes.net/\">Quotes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-references\"><a rel=\"nofollow\" href=\"http://www.references.net/\">References</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-rhymes\"><a rel=\"nofollow\" href=\"http://www.rhymes.net/\">Rhymes</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-scripts\"><a rel=\"nofollow\" href=\"http://www.scripts.com/\">Scripts</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-symbols\"><a rel=\"nofollow\" href=\"http://www.symbols.com/\">Symbols</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-synonyms\"><a rel=\"nofollow\" href=\"http://www.synonyms.net/\">Synonyms</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-ua\"><a rel=\"nofollow\" href=\"http://www.useragents.com/\">User Agents</a></li>\n" +
                "\t\t\t\t\t\t<li class=\"nw-uszip\"><a rel=\"nofollow\" href=\"http://www.uszip.com/\">Zip Codes</a></li>\n" +
                "\t\t\t\t\t</ul>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\n" +
                "\t<div class=\"clearfix\">\n" +
                "\t\t<div class=\"copyright\"><strong>&copy; 2001-2017 STANDS4 LLC.</strong><br>All rights reserved.</div>\n" +
                "\t\t<div id=\"social-icons\">\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"http://www.facebook.com/STANDS4\" target=\"_blank\"><div class=\"social fb\"></div></a>\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"http://twitter.com/justadded\" target=\"_blank\"><div class=\"social tw\"></div></a>\n" +
                "\t\t\t<a rel=\"nofollow\" href=\"https://plus.google.com/+abbreviations/\" rel=\"publisher\" target=\"_blank\"><div class=\"social gp\"></div></a>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t</div>\n" +
                "</footer>\n" +
                "\n" +
                "</div>\n" +
                "<!--[if gt IE 8]>-->\n" +
                "<script src=\"root/app_common/js/libs/modernizr-2.8.3.custom.min.js\"></script>\n" +
                "<!--<![endif]-->\n" +
                "\n" +
                "<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>\n" +
                "<script>window.jQuery || document.write('<script src=\"root/app_common/js/libs/jquery-1.11.2.min.js\"><\\/script>')</script>\n" +
                "\n" +
                "<script src=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js\"></script>\n" +
                "<script>window.jQuery || document.write('<script src=\"root/app_common/js/libs/jquery-ui-1.11.3.custom.min.js\"><\\/script>')</script>\n" +
                "\n" +
                "<script src=\"root/app_common/js/libs/jquery.placeholder.min.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/wselect.js\"></script>\n" +
                "<script src=\"root/app_common/js/libs/bootstrap-3.3.2.min.js\"></script>\n" +
                "\n" +
                "<script src=\"https://use.fontawesome.com/1d5fda5f00.js\"></script>\n" +
                "\n" +
                "<script src=\"js/lyrc.js\"></script>\n" +
                "<!-- /52304935/Lyrics_1x1_Slider -->\n" +
                "<div id='div-gpt-ad-Lyrics_1x1_Slider' style='height:1px; width:1px;'>\n" +
                "<script>\n" +
                "googletag.cmd.push(function() { googletag.display('div-gpt-ad-Lyrics_1x1_Slider'); });\n" +
                "</script>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n" +
                "<!-- Timer: 0.6399 secs | Server: 127.0.0.1 -->");

        /*System.out.println(htmlReaderTest.findComposer());
        System.out.println(htmlReaderTest.findLyricsURL());
        System.out.println(htmlReaderTest.findTitle());*/

        //TitleToSpotifyURITest titleToSpotifyURITest = new TitleToSpotifyURITest("Think of Me");
        //System.out.println(titleToSpotifyURITest.constructSearchURL());
        //System.out.println(titleToSpotifyURITest.getURIFromHTML(htmlForURI));

        LyricsPageHTMLReaderTest lyricsPageHTMLReaderTest = new LyricsPageHTMLReaderTest();

        ArrayList<String> title = lyricsPageHTMLReaderTest.separateWords("Never Gonna Give You Up");
        //ArrayList<String> artist = lyricsPageHTMLReaderTest.separateWords("Rick Astly");
        //String lyricsSearchLink = lyricsPageHTMLReaderTest.createAToZLyricsSearchLink(title, artist);
        //System.out.println(lyricsSearchLink);

        ArrayList<String> testerHTMLLines = new ArrayList<>();
        testerHTMLLines = lyricsPageHTMLReaderTest.findLyrics("\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<meta name=\"description\" content=\"Lyrics to &quot;Never Gonna Give You Up&quot; song by Rick Astley: We're no strangers to love You know the rules and so do I A full commitment's what I'm thinking of Y...\"> \n" +
                "<meta name=\"keywords\" content=\"Never Gonna Give You Up lyrics, Rick Astley Never Gonna Give You Up lyrics, Rick Astley lyrics\">\n" +
                "<meta name=\"robots\" content=\"noarchive\">\n" +
                "<meta property=\"og:image\" content=\"//www.azlyrics.com/az_logo_tr.png\">\n" +
                "<title>Rick Astley Lyrics - Never Gonna Give You Up</title>\n" +
                "\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n" +
                "<link rel=\"stylesheet\" href=\"//www.azlyrics.com/bsaz.css\">\n" +
                "\n" +
                "<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
                "<!--[if lt IE 9]>\n" +
                "<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n" +
                "<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
                "<![endif]-->\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "ArtistName = \"Rick Astley\";\n" +
                "SongName = \"Never Gonna Give You Up\";\n" +
                "function submitCorrections(){\n" +
                "\tif (!confirm('These lyrics are reviewed and considered to be correct.\\nAre you sure want to proceed?')) return false;\n" +
                "\tdocument.getElementById('corlyr').submit();\n" +
                "\treturn false;\n" +
                "}\n" +
                "</script>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<!-- Begin comScore Tag -->\n" +
                "<script>\n" +
                "  var _comscore = _comscore || [];\n" +
                "  _comscore.push({ c1: \"2\", c2: \"6772046\" });\n" +
                "  (function() {\n" +
                "    var s = document.createElement(\"script\"), el = document.getElementsByTagName(\"script\")[0]; s.async = true;\n" +
                "    s.src = (document.location.protocol == \"https:\" ? \"https://sb\" : \"http://b\") + \".scorecardresearch.com/beacon.js\";\n" +
                "    el.parentNode.insertBefore(s, el);\n" +
                "  })();\n" +
                "</script>\n" +
                "<noscript>\n" +
                "  <img src=\"https://sb.scorecardresearch.com/p?c1=2&c2=6772046&cv=2.0&cj=1\" alt=\"\">\n" +
                "</noscript>\n" +
                "<!-- End comScore Tag -->\n" +
                "\n" +
                "<div id=\"fb-root\"></div>\n" +
                "<script>(function(d, s, id) {\n" +
                "  var js, fjs = d.getElementsByTagName(s)[0];\n" +
                "  if (d.getElementById(id)) return;\n" +
                "  js = d.createElement(s); js.id = id;\n" +
                "  js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.3\";\n" +
                "  fjs.parentNode.insertBefore(js, fjs);\n" +
                "}(document, 'script', 'facebook-jssdk'));</script>\n" +
                "\n" +
                "  <nav class=\"navbar navbar-default navbar-static-top noprint\">\n" +
                "  <div class=\"container\">\n" +
                "    <!-- Brand and toggle get grouped for better mobile display -->\n" +
                "    <div class=\"navbar-header\">\n" +
                "      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#search-collapse\">\n" +
                "        <span class=\"glyphicon glyphicon-search\"></span>\n" +
                "      </button>\n" +
                "      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#artists-collapse\">\n" +
                "        <span class=\"glyphicon glyphicon-th-list\"></span>\n" +
                "      </button>\n" +
                "      <a class=\"navbar-brand\" href=\"//www.azlyrics.com\"><img alt=\"AZLyrics.com\" class=\"pull-left\" style=\"max-height:40px; margin-top:-10px;\" src=\"//www.azlyrics.com/az_logo_tr.png\"></a>\n" +
                "    </div>\n" +
                "    <ul class=\"collapse navbar-collapse nav navbar-nav\" id=\"artists-collapse\">\n" +
                "    <li>\n" +
                "    <div class=\"btn-group text-center\" role=\"group\">\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/a.html\">A</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/b.html\">B</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/c.html\">C</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/d.html\">D</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/e.html\">E</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/f.html\">F</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/g.html\">G</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/h.html\">H</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/i.html\">I</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/j.html\">J</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/k.html\">K</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/l.html\">L</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/m.html\">M</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/n.html\">N</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/o.html\">O</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/p.html\">P</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/q.html\">Q</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/r.html\">R</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/s.html\">S</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/t.html\">T</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/u.html\">U</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/v.html\">V</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/w.html\">W</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/x.html\">X</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/y.html\">Y</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/z.html\">Z</a>\n" +
                "    <a class=\"btn btn-menu\" href=\"//www.azlyrics.com/19.html\">#</a>\n" +
                "    </div>\n" +
                "    </li>\n" +
                "    </ul>\n" +
                "\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"search-collapse\">\n" +
                "\n" +
                "        <form class=\"navbar-form navbar-right search\" method=\"get\" action=\"//search.azlyrics.com/search.php\" role=\"search\">\n" +
                "         <div class=\"input-group\">  \n" +
                "\t\t<input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"q\" id=\"q\">\n" +
                "       \t\t<span class=\"input-group-btn\">\n" +
                "            \t  <button class=\"btn btn-primary\" type=\"submit\"><span class=\"glyphicon glyphicon-search\"></span> Search</button>\n" +
                "          \t</span>\n" +
                " \t  </div>   \n" +
                "\t</form>\n" +
                "\n" +
                "    </div><!-- /.navbar-collapse -->\n" +
                "    </div><!-- /.container -->\n" +
                "  </nav>\n" +
                "\n" +
                "<!-- top ban -->\n" +
                "  <div class=\"lboard-wrap noprint\">\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"row\">\n" +
                "       <div class=\"col-xs-12 top-ad text-center\">\n" +
                "         <span id=\"cf_banner_top_nofc\"></span>\n" +
                "       </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "\n" +
                "<!-- main -->\n" +
                "<div class=\"container main-page\">\n" +
                "<div class=\"row\">\n" +
                "<div class=\"col-lg-2 text-center hidden-md hidden-sm hidden-xs noprint\">\n" +
                "   <div class=\"sky-ad\"></div>\n" +
                "</div>\n" +
                "\n" +
                "<!-- content -->\n" +
                "<div class=\"col-xs-12 col-lg-8 text-center\">\n" +
                "\n" +
                "<div class=\"div-share noprint\">\n" +
                "<div class=\"fb-like\" style=\"float:left;\" data-href=\"https://www.azlyrics.com/lyrics/rickastley/nevergonnagiveyouup.html\" data-layout=\"button_count\" data-action=\"like\" data-show-faces=\"false\" data-share=\"false\"></div>\n" +
                "<!-- AddThis Button BEGIN -->\n" +
                "<script type=\"text/javascript\" src=\"https://s7.addthis.com/js/300/addthis_widget.js#username=azlyrics\"></script>\n" +
                "<div class=\"addthis_toolbox addthis_default_style\" style=\"float:right;\">\n" +
                "<a class=\"btn btn-xs btn-share addthis_button_email\">\n" +
                "<span class=\"playblk\"><img src=\"//www.azlyrics.com/images/email.svg\" width=\"56\" height=\"18\" class=\"playblk\" alt=\"Email\"></span>\n" +
                "</a>\n" +
                "<a class=\"btn btn-xs btn-share addthis_button_print\" style=\"margin-right: 0px !important;\">\n" +
                "<span class=\"playblk\"><img src=\"//www.azlyrics.com/images/print.svg\" width=\"56\" height=\"18\" class=\"playblk\" alt=\"Print\"></span>\n" +
                "</a>\n" +
                "</div>\n" +
                "</div>\n" +
                "<!-- AddThis Button END -->\n" +
                "\n" +
                "<div class=\"div-share\"><h1>\"Never Gonna Give You Up\" lyrics</h1></div>\n" +
                "\n" +
                "<div class=\"lyricsh\">\n" +
                "<h2><b>Rick Astley Lyrics</b></h2>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"ringtone\">\n" +
                "<span id=\"cf_text_top\"></span>\n" +
                "</div>\n" +
                "\n" +
                "<b>\"Never Gonna Give You Up\"</b><br>\n" +
                "<br>\n" +
                "\n" +
                "<div>\n" +
                "<!-- Usage of azlyrics.com content by any third-party lyrics provider is prohibited by our licensing agreement. Sorry about that. -->\n" +
                "We're no strangers to love<br>\n" +
                "You know the rules and so do I<br>\n" +
                "A full commitment's what I'm thinking of<br>\n" +
                "You wouldn't get this from any other guy<br>\n" +
                "<br>\n" +
                "I just wanna tell you how I'm feeling<br>\n" +
                "Gotta make you understand<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you<br>\n" +
                "<br>\n" +
                "We've known each other for so long<br>\n" +
                "Your heart's been aching, but<br>\n" +
                "You're too shy to say it<br>\n" +
                "Inside, we both know what's been going on<br>\n" +
                "We know the game and we're gonna play it<br>\n" +
                "<br>\n" +
                "And if you ask me how I'm feeling<br>\n" +
                "Don't tell me you're too blind to see<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you<br>\n" +
                "<br>\n" +
                "(Ooh, give you up)<br>\n" +
                "(Ooh, give you up)<br>\n" +
                "Never gonna give, never gonna give<br>\n" +
                "(Give you up)<br>\n" +
                "Never gonna give, never gonna give<br>\n" +
                "(Give you up)<br>\n" +
                "<br>\n" +
                "We've known each other for so long<br>\n" +
                "Your heart's been aching, but<br>\n" +
                "You're too shy to say it<br>\n" +
                "Inside, we both know what's been going on<br>\n" +
                "We know the game and we're gonna play it<br>\n" +
                "<br>\n" +
                "I just wanna tell you how I'm feeling<br>\n" +
                "Gotta make you understand<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you<br>\n" +
                "<br>\n" +
                "Never gonna give you up<br>\n" +
                "Never gonna let you down<br>\n" +
                "Never gonna run around and desert you<br>\n" +
                "Never gonna make you cry<br>\n" +
                "Never gonna say goodbye<br>\n" +
                "Never gonna tell a lie and hurt you\n" +
                "</div>\n" +
                "\n" +
                "<br><br>\n" +
                "\n" +
                "<!-- MxM banner -->\n" +
                "<div class=\"noprint\">\n" +
                "<script>\n" +
                "if  ( /Android|webOS|iPhone|iPod|iPad|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) \n" +
                "  {\n" +
                "     document.write('<div style=\"margin-left: auto; margin-right: auto;\">'+\n" +
                "  '<iframe scrolling=\"no\" style=\"border: 0px none; overflow:hidden;\" src=\"//adv.mxmcdn.net/br/t1.0/m_js/e_0/sn_0/l_13343320/su_0/tr_kuidlGxnLc3XwQPQMEKDzyUZbWVwOLgTKrWdYCGo1xwyhpgPEZIDxPIJS36Etprwu25NGBVl1ZNRBBJC6lJBTUJLqHOXnAb42Cg3ppxgwz_KNCn4eLlByewajrwIJRKxuTtwKWMr-p3cRzxh-sGVzw6ukAUaGBB4TJi67nuiHb7FLu07sLOxqaCmHWqoSq64DWtRx2gowWGsUwi2LrwrnBS0wl7W6aRzGEyaKOSatX4WXHG3wTze_zI3ICgERr35rUX20AwG6hItSkZLmMx9gvFqWZnK1JDj7yiNwFIhtwu1Llu3NZljyWuZQMPKjxeqyFgmXFN0zWLbqVNDnXQ-MvmZcn4ay2sjEMtJeRdWpY8k0zQqitGpBOr6G756Y_fF/\" width=\"290px\" height=\"50px\"></iframe>'+\n" +
                "  '</div>');\n" +
                "   }\n" +
                "</script>\n" +
                "<br><br>\n" +
                "</div>\n" +
                "\n" +
                "<form id=\"addsong\" style=\"visible:hidden; margin:0;\" action=\"../../add.php\" method=\"post\">\n" +
                "<input type=\"hidden\" name=\"what\" value=\"add_song\">\n" +
                "<input type=\"hidden\" name=\"artist\" value=\"Rick Astley\">\n" +
                "</form>\n" +
                "\n" +
                "<form action=\"../../add.php\" method=\"post\" id=\"corlyr\">\n" +
                "<input type=\"hidden\" name=\"what\" value=\"correct_lyrics\">\n" +
                "<input type=\"hidden\" name=\"song_id\" value=\"274705\">\n" +
                "</form>\n" +
                "\n" +
                "<div class=\"smt noprint\">\n" +
                "<a class=\"btn btn-share\" href=\"#\" onclick=\"submitCorrections()\"><span class=\"glyphicon glyphicon-pencil\"></span> Submit Corrections</a>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"smt\"></div>\n" +
                "\n" +
                "<div class=\"noprint\" style=\"padding: 15px 0\">\n" +
                "<span id=\"cf_text_bottom\"></span>\n" +
                "</div>\n" +
                "\n" +
                "<!-- credits -->\n" +
                "<div class=\"smt\"><small>Writer(s): Michael Stock, Peter Alan Waterman, Matthew James Aitken</small>\n" +
                "<br>\n" +
                "</div>\n" +
                "\n" +
                "<!-- artist link -->\n" +
                "<ol class=\"breadcrumb noprint\" itemscope itemtype=\"https://schema.org/BreadcrumbList\">\n" +
                "  <li itemprop=\"itemListElement\" itemscope itemtype=\"https://schema.org/ListItem\"><a itemprop=\"item\" href=\"//www.azlyrics.com\"><span itemprop=\"name\">AZLyrics</span></a></li>\n" +
                "  <li itemprop=\"itemListElement\" itemscope itemtype=\"https://schema.org/ListItem\"><a itemprop=\"item\" href=\"//www.azlyrics.com/r.html\"><span itemprop=\"name\">R</span></a></li>\n" +
                "  <li itemprop=\"itemListElement\" itemscope itemtype=\"https://schema.org/ListItem\"><a itemprop=\"item\" href=\"//www.azlyrics.com/r/rickastley.html\"><span itemprop=\"name\">Rick Astley Lyrics</span></a></li>\n" +
                "</ol>\n" +
                "\n" +
                "<!-- album songlists -->\n" +
                "<div class=\"panel album-panel noprint\">\n" +
                "  <span class=\"glyphicon glyphicon-cd\" style=\"margin-right:5px;\"></span><a href=\"#24924\" data-toggle=\"collapse\">\"Whenever You Need Somebody\" (1987)</a>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"collapse noprint\" id=\"24924\">\n" +
                "<div class=\"panel songlist-panel\">\n" +
                "<a href=\"nevergonnagiveyouup.html\">Never Gonna Give You Up</a><br>\n" +
                "<a href=\"wheneveryouneedsomebody.html\">Whenever You Need Somebody</a><br>\n" +
                "<a href=\"togetherforever.html\">Together Forever</a><br>\n" +
                "<a href=\"itwouldtakeastrongstrongman.html\">It Would Take A Strong Strong Man</a><br>\n" +
                "<a href=\"thelovehasgone.html\">The Love Has Gone</a><br>\n" +
                "<a href=\"dontsaygoodbye.html\">Don't Say Goodbye</a><br>\n" +
                "<a href=\"slippingaway.html\">Slipping Away</a><br>\n" +
                "<a href=\"nomorelookingforlove.html\">No More Looking For Love</a><br>\n" +
                "<a href=\"youmoveme.html\">You Move Me</a><br>\n" +
                "<a href=\"whenifallinlove.html\">When I Fall In Love</a><br>\n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "<!-- album songlists end -->\n" +
                "\n" +
                "        <form class=\"search noprint\" method=\"get\" action=\"//search.azlyrics.com/search.php\" role=\"search\">\n" +
                "         <div style=\"margin-bottom:15px\" class=\"input-group\">  \n" +
                "\t\t<input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"q\">\n" +
                "       \t\t<span class=\"input-group-btn\">\n" +
                "            \t  <button class=\"btn btn-primary\" type=\"submit\"><span class=\"glyphicon glyphicon-search\"></span> Search</button>\n" +
                "          \t</span>\n" +
                " \t  </div>   \n" +
                "\t</form>\n" +
                "\n" +
                "<div class=\"noprint visible-xs-block\" style=\"margin-top:5px;margin-bottom:5px\">\n" +
                "<span id=\"cf_rect_bottom\"></span>\n" +
                "</div>\n" +
                "\n" +
                "</div> <!-- content -->\n" +
                "\n" +
                "<div class=\"col-lg-2 text-center hidden-md hidden-sm hidden-xs noprint\">\n" +
                "   <div class=\"sky-ad\"></div>\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>  <!-- container main-page -->\n" +
                "\n" +
                "<!-- nav bottom -->\n" +
                "       <nav class=\"navbar navbar-default navbar-bottom\">\n" +
                "          <div class=\"container text-center\">\n" +
                "          <ul class=\"nav navbar-nav navbar-center\">\n" +
                "            <li><a href=\"//www.azlyrics.com/add.php\" onclick=\"document.forms['addsong'].submit();return false;\">Submit Lyrics</a></li>\n" +
                "            <li><a href=\"//www.stlyrics.com\">Soundtracks</a></li>\n" +
                "            <li><a href=\"//www.facebook.com/pages/AZLyricscom/154139197951223\">Facebook</a></li>\n" +
                "            <li><a href=\"//www.azlyrics.com/contact.html\">Contact Us</a></li>\n" +
                "          </ul>\n" +
                "          </div> \n" +
                "        </nav>\n" +
                "\n" +
                "<!-- bot ban -->\n" +
                "  <div class=\"lboard-wrap noprint\">\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"row\">\n" +
                "       <div class=\"col-xs-12 top-ad text-center\">\n" +
                "          <span id=\"cf_banner_bottom\"></span>\n" +
                "       </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  </div>\n" +
                "\n" +
                "<!-- footer -->\n" +
                "     <nav class=\"navbar navbar-footer noprint\">\n" +
                "          <div class=\"container text-center\">\n" +
                "          <ul class=\"nav navbar-nav navbar-center\">\n" +
                "            <li><a href=\"//www.azlyrics.com/adv.html\">Advertise Here</a></li>\n" +
                "            <li><a href=\"//www.azlyrics.com/privacy.html\">Privacy Policy</a></li>\n" +
                "            <li><a href=\"//www.azlyrics.com/copyright.html\">DMCA Policy</a></li>\n" +
                "          </ul>\n" +
                "          </div> \n" +
                "     </nav>\n" +
                "     <div class=\"footer-wrap\">\n" +
                "          <div class=\"container\">\n" +
                "          <div class=\"noprint\"><span style=\"font-weight:bold;line-height:54px;vertical-align:top;\">Powered by </span><img src=\"//www.azlyrics.com/images/mxm.png\" width=\"184\" height=\"54\" alt=\"MusixMatch\"></div>\n" +
                "          <small>\n" +
                "             Rick Astley lyrics are property and copyright of their owners. \"Never Gonna Give You Up\" lyrics provided for educational purposes and personal use only.<br>\n" +
                "             <script type=\"text/javascript\">\n" +
                "                curdate=new Date();\n" +
                "                document.write(\"<strong>Copyright &copy; 2000-\"+curdate.getFullYear()+\" AZLyrics.com<\\/strong>\");\n" +
                "             </script>\n" +
                "          </small>\n" +
                "          </div>\n" +
                "     </div>\n" +
                "\n" +
                "<script>\n" +
                "cf_page_artist = ArtistName;\n" +
                "cf_page_song = SongName;\n" +
                "cf_page_genre = \"pop\";\n" +
                "</script>\n" +
                "<script src=\"//cdn.clickfuse.com/publishers/azlyrics/single.min.js\"></script>\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "\n" +
                "  var _gaq = _gaq || [];\n" +
                "  _gaq.push(['_setAccount', 'UA-4309237-1']);\n" +
                "\n" +
                "  (function() {\n" +
                "    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n" +
                "    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
                "    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n" +
                "  })();\n" +
                "\n" +
                "</script>\n" +
                "    <div id=\"CssFailCheck\" class=\"hidden\" style=\"height:1px;\"></div>\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n" +
                "    <script>window.jQuery || document.write('<script src=\"//www.azlyrics.com/local/jquery.min.js\"><\\/script>')</script>\n" +
                "    <script>\n" +
                "      $(function () {\n" +
                "       if ($('#CssFailCheck').is(':visible') === true) {\n" +
                "         $('<link rel=\"stylesheet\" type=\"text/css\" href=\"//www.azlyrics.com/bs/css/bootstrap.min.css\"><link rel=\"stylesheet\" href=\"//www.azlyrics.com/bsaz.css\">').appendTo('head');\n" +
                "       }\n" +
                "      });\n" +
                "    </script>\n" +
                "    <script src=\"//www.azlyrics.com/collapse.js\"></script>\n" +
                "    <script type=\"text/javascript\" src=\"https://tracking.musixmatch.com/t1.0/m_js/e_0/sn_0/l_13343320/su_0/tr_kuidlGxnLc3XwQPQMEKDzyUZbWVwOLgTKrWdYCGo1xwyhpgPEZIDxPIJS36Etprwu25NGBVl1ZNRBBJC6lJBTUJLqHOXnAb42Cg3ppxgwz_KNCn4eLlByewajrwIJRKxuTtwKWMr-p3cRzxh-sGVzw6ukAUaGBB4TJi67nuiHb7FLu07sLOxqaCmHWqoSq64DWtRx2gowWGsUwi2LrwrnBS0wl7W6aRzGEyaKOSatX4WXHG3wTze_zI3ICgERr35rUX20AwG6hItSkZLmMx9gvFqWZnK1JDj7yiNwFIhtwu1Llu3NZljyWuZQMPKjxeqyFgmXFN0zWLbqVNDnXQ-MvmZcn4ay2sjEMtJeRdWpY8k0zQqitGpBOr6G756Y_fF/\"></script>\n" +
                "  </body>\n" +
                "</html>");

        /*int l = testerHTMLLines.size();
        while(l > 0){
            int i = 0;
            System.out.println(testerHTMLLines.get(i));
            i++;
            l--;
        }*/


    }
}
