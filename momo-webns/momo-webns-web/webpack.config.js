//

//const HTMLWebpackPlugin = require('html-webpack-plugin')
const ExtractTextPlugin = require('extract-text-webpack-plugin')
const OptimizeCssAssetsPlugin = require('optimize-css-assets-webpack-plugin')
const UglifyJSPlugin = require('uglifyjs-webpack-plugin')
const webpack = require('webpack')

var path = require('path');
module.exports = {
    
    //js file that starts it all
	entry: './src/main/js/',
	//devtool: 'sourcemaps',    
    output: {
        path: __dirname,
        //filename: './src/main/resources/static/built/bundle.js'
        filename: './src/main/webapp/public/bundle.js'
    },

    
    //loaders, seperate js files (modules) that are bundled together
    module: {
        rules: [
                // babel - es6 code is converted to es5
                {
                    test: path.join(__dirname, '.'),
                    exclude: /(node_modules)/,
                    use: {
                      loader: 'babel-loader',
                      options: {
                        presets: ['env', 'es2015', 'react'],
                        //plugins: [require('babel-plugin-transform-object-rest-spread')]
                      }
                    }
                  },

            // use to extract css from js file
            {
                test: /\.css$/,
                exclude: /node_modules/,
                use: ExtractTextPlugin.extract({
                            use: ["css-loader", "sass-loader"],
                            fallback: "style-loader",
                            publicPath: '/dist'
                    })
                
            },
            {
            	test: /\.(scss)$/,
                use: [
                  {
                    // Adds CSS to the DOM by injecting a `<style>` tag
                    loader: 'style-loader'
                  },
                  {
                    // Interprets `@import` and `url()` like `import/require()` and will resolve them
                    loader: 'css-loader'
                  },
                  {
                    // Loader for webpack to process CSS with PostCSS
                    loader: 'postcss-loader',
                    options: {
                      plugins: function () {
                        return [
                          require('autoprefixer')
                        ];
                      }
                    }
                  },
                  {
                    // Loads a SASS/SCSS file and compiles it to CSS
                    loader: 'sass-loader'
                  }
                ]
            	
            }
            
        ]
    },
 // plugins happen after modules have been bundled (modules being seperate js files)
    plugins: [



        //add css
        new ExtractTextPlugin({
            filename: 'styles.css',
            disable: false,
            allChunks: true
        }),

        //add minify to css
        new OptimizeCssAssetsPlugin({
            assetNameRegExp: /\.css$/,
            cssProcessor: require('cssnano'),
            cssProcessorOptions: { discardComments: {removeAll: true } },
            canPrint: true
        }),

        //reduce react size
        new webpack.DefinePlugin({ // <-- key to reducing React's size
            'process.env': {
            'NODE_ENV': JSON.stringify('production')
            }
        }),

        new webpack.optimize.UglifyJsPlugin({
            compress: {
                screw_ie8: false,
                warnings: false
            }
        }),
        new webpack.optimize.AggressiveMergingPlugin()//Merge chunks 
    ]


  
}
